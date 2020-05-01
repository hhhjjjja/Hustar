import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EquipManagement {
	public static String[] array = new String[100];

	public static String[] FileReadFn(File file) {
		int i=0;
		
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(fileReader);
			
			String line = "";
			while((line = bufReader.readLine()) != null) {
				//System.out.println(line);
				array[i] = line;
				i++;
			}
			bufReader.close();
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			System.out.println(e);
		}
		return array;
	}
	
	public static void FileWriteFn() {
		Scanner s = new Scanner(System.in);
		String name, num, date, ava, con;
		
		File file = new File("data.txt");
		FileWriter writer = null;
		
		while(true) {
			System.out.print("���� : ");
			name = s.nextLine();
			
			System.out.print("���� : ");
			num = s.nextLine();
			
			System.out.println("������(��:1990-01-01) : ");
			date = s.nextLine();
			
			System.out.print("�����(��:y or n) : ");
			ava = s.nextLine();
			
			String msg = name+"\t"+num+"\t"+date+"\t"+ava+"\r\n";
			
			try {
				//true:�������뿡 �̾��. false:���������������
				writer = new FileWriter(file, true);
				writer.write(msg);
				writer.flush();
				
			} catch(IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(writer != null) writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			System.out.print("��� �Է��Ͻðڽ��ϱ�(y/n)? : ");
			con = s.nextLine();
			
			if(con.equals("n")) break;
		}
		
	}
	
	public static void printData(File file) {
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println("  ����\t����\t������\t\t�����");
		System.out.println("-------------------------------------------------");
		
		String printArr[];
		printArr = FileReadFn(file);
		
		for(int i=0;i<printArr.length;i++) {
			if(printArr[i] == null) break;
			System.out.println("  "+printArr[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//���α׷� ���� �� ���� ��������Ȯ��, �����ϸ� file read
		File file = new File("data.txt");
		boolean isExists = file.exists();
		
		if(isExists) {
			String printArr[];
			printArr = FileReadFn(file);
			
			for(int i=0;i<printArr.length;i++) {
				if(printArr[i] == null) break;
				System.out.println(printArr[i]);
			}
		}
		
		while(true) {
			System.out.print("1. �Է�\n2. ���\n3. ����\n�޴��� �����Ͻÿ�:");
			int m = scan.nextInt();
			
			switch(m) {
			case 1:
				FileWriteFn();
				break;
			case 2:
				printData(file);
				break;
			case 3:
				System.out.println("����");
				break;
			}
			System.out.print("���α׷��� �����Ͻðڽ��ϱ�(y/n)?");
			String ex = scan.next();
			
			if(ex.equals("y")) {
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
}