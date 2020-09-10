package pre.work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.poi.hssf.util.HSSFColor.HSSFColorPredefined;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class exData implements Comparable<exData>{
	private String name;
	private String num;
	private String per;
	
	public String getName(){
		return name;
	}
	public String getNum() {
		return num;
	}
	public String getPer() {
		return per;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public void setPer(String per) {
		this.per = per;
	}
	
	public int compareTo(exData ex) {
		if(Double.parseDouble(this.num) < Double.parseDouble(ex.getNum())) {
			return 1;
		} else if(Double.parseDouble(this.num) > Double.parseDouble(ex.getNum())) {
			return -1;
		}
		return 0;
	}
}

public class ExcelEditing {
	
	//엑셀 읽어오기
	public ArrayList<exData> readExcel() {
		String path = ExcelEditing.class.getResource("").getPath();
		ArrayList<exData> list = new ArrayList<exData>();
		
		try{
			File file = new File(path + "[첨부2]기관별간접비 고시기준.xlsx");
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			int rowindex=0;
			int colindex=0;
			
			//시트 수
			XSSFSheet sheet = workbook.getSheetAt(0);
			//행의 수
			int rows = sheet.getPhysicalNumberOfRows();
			for(rowindex=2; rowindex <rows ; rowindex++) {
			
				exData ed = new exData();
				double a=0;
				
				//행 읽기
				XSSFRow row = sheet.getRow(rowindex);
				XSSFCell cell=row.getCell(2);
				
				ed.setName(String.valueOf(row.getCell(0)));
				ed.setNum(String.valueOf(row.getCell(1)));
				
				String value = "";
				
				switch (row.getCell(2).getCellType()){
				case FORMULA:
					a = (row.getCell(2).getNumericCellValue())*100;
					value = Math.round(a*100)/100.0 + "%";
					break;
				case STRING:
					value = row.getCell(2).getStringCellValue()+"";
					break;
				case NUMERIC:
					a = (row.getCell(2).getNumericCellValue())*100;
					value = Math.round(a*100)/100.0 + "%";
					break;
				}
				
				ed.setPer(value);
				
				list.add(ed);
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return list;
	}


	//수정, 스타일지정
	public void writeExcel(ArrayList<exData> list) {
		String path = ExcelEditing.class.getResource("").getPath();	//저장할 파일 경로
		
		try {
			File file = new File(path + "[첨부2]기관별간접비 고시기준.xlsx");
			FileOutputStream fileout = new FileOutputStream(file);
			
			XSSFWorkbook xworkbook = new XSSFWorkbook();
			
			//Title
			XSSFFont TitleFont = xworkbook.createFont();
			TitleFont.setFontHeightInPoints((short)14);
			TitleFont.setFontName("맑은 고딕");
			TitleFont.setBold(true);
			
			CellStyle TitleStyle = xworkbook.createCellStyle();
			TitleStyle.setAlignment(HorizontalAlignment.CENTER);
			TitleStyle.setFont(TitleFont);
			
			//Body
			XSSFFont BodyFont = xworkbook.createFont();
			BodyFont.setFontHeightInPoints((short)11);
			BodyFont.setFontName("맑은 고딕");
			
			CellStyle BodyStyle = xworkbook.createCellStyle();
			BodyStyle.setAlignment(HorizontalAlignment.CENTER);
			BodyStyle.setBorderTop(BorderStyle.THIN);
			BodyStyle.setBorderBottom(BorderStyle.THIN);
			BodyStyle.setBorderLeft(BorderStyle.THIN);
			BodyStyle.setBorderRight(BorderStyle.THIN);
			BodyStyle.setFont(BodyFont);
			
			//Point
			CellStyle PointStyle = xworkbook.createCellStyle();
			PointStyle.setFillForegroundColor(HSSFColorPredefined.YELLOW.getIndex());
			PointStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			PointStyle.setAlignment(HorizontalAlignment.CENTER);
			PointStyle.setBorderTop(BorderStyle.THIN);
			PointStyle.setBorderBottom(BorderStyle.THIN);
			PointStyle.setBorderLeft(BorderStyle.THIN);
			PointStyle.setBorderRight(BorderStyle.THIN);
			PointStyle.setFont(BodyFont);
			
			//Header
			XSSFFont HeadFont = xworkbook.createFont();
			HeadFont.setBold(true);
			HeadFont.setFontHeightInPoints((short)11);
			HeadFont.setFontName("맑은 고딕");
			
			CellStyle HeadStyle = xworkbook.createCellStyle();
			HeadStyle.setAlignment(HorizontalAlignment.CENTER);
			HeadStyle.setFillForegroundColor(HSSFColorPredefined.GREY_25_PERCENT.getIndex());
			HeadStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			HeadStyle.setBorderTop(BorderStyle.THIN);
			HeadStyle.setBorderBottom(BorderStyle.THIN);
			HeadStyle.setBorderLeft(BorderStyle.THIN);
			HeadStyle.setBorderRight(BorderStyle.THIN);
			HeadStyle.setFont(HeadFont);
			
			XSSFSheet xsheet = xworkbook.createSheet("기관별 간접비율");		//시트 생성
			XSSFRow curRow;
			
			int row = list.size();		//리스트 크기
			Cell cell = null;
			
			//Title
			curRow = xsheet.createRow(0);
			cell = curRow.createCell(0);
			cell.setCellValue("2019년도 기관별 간접비율");
			cell.setCellStyle(TitleStyle);
			
			//Head
			curRow = xsheet.createRow(1);
			cell = curRow.createCell(0);
			cell.setCellValue("기관명");
			cell.setCellStyle(HeadStyle);
			
			cell = curRow.createCell(1);
			cell.setCellValue("간접비율");
			cell.setCellStyle(HeadStyle);
			
			cell = curRow.createCell(2);
			cell.setCellValue("%");
			cell.setCellStyle(HeadStyle);
			
			//Body
			for(int i=2;i<row;i++){
				curRow = xsheet.createRow(i); // row 생성
				
                cell = curRow.createCell(0);
                cell.setCellValue(list.get(i).getName());
                
                //셀스타일
                if(list.get(i).getName().equals("경북대학교")) {
                	cell.setCellStyle(PointStyle);
                } else{ cell.setCellStyle(BodyStyle); }
                
                cell = curRow.createCell(1);
                cell.setCellValue(list.get(i).getNum());
                
                //셀스타일
                if(list.get(i).getName().equals("경북대학교")) {
                	cell.setCellStyle(PointStyle);
                } else{ cell.setCellStyle(BodyStyle); }
                
                cell = curRow.createCell(2);
                cell.setCellValue(list.get(i).getPer());
                
                //셀스타일
                if(list.get(i).getName().equals("경북대학교")) {
                	cell.setCellStyle(PointStyle);
                } else{ cell.setCellStyle(BodyStyle); }
			}
			
			//열 너비 설정
			for(int i=0;i<3;i++) {
				xsheet.autoSizeColumn(i);
				xsheet.setColumnWidth(i, (xsheet.getColumnWidth(i))+256);
			}
			
			xworkbook.write(fileout);
			fileout.close();
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		ExcelEditing cl = new ExcelEditing();
		ArrayList<exData> list = new ArrayList<exData>();
		list = cl.readExcel();
		
		Collections.sort(list);
		cl.writeExcel(list);
		System.out.println("Complete.");
	}
}
