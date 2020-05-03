import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//MapSize 전체 바둑판 크기 설정
class MapSize {
	final int CELL = 30;		//한 칸 크기
	final int SIZE = 20;		//line 수
	public int getCell() {
		return CELL;
	}
	public int getSize() {
		return SIZE;
	}
}


//Map 돌 위치, 색 판정
class Map {
	short[][] map;				//맵 배열 1일때 흑, -1일때 백, 0일때 돌X
	final short BLACK = 1;
	final short WHITE = -1;
	boolean checkBnW = true;	//흑백 차례
	
	MapSize ms;
	
	public Map(MapSize ms) {
		map = new short[ms.getSize()][];
		for (int i=0; i< map.length; i++) {
			map[i] = new short[ms.getSize()];
		}
	}
	
	public short getBlack() {
		return BLACK;
	}
	public short getWhite() {
		return WHITE;
	}
	public short getXY (int y, int x) {
		return map[y][x];
	}
	public boolean getCheck() {
		return checkBnW;
	}
	public void changeCheck() {
		if(checkBnW) checkBnW = false;
		else checkBnW = true;
	}
	
	//checkBnW 확인해서 true면 map에 Black, false면 white
	public void setMap(int y, int x) {
		if(checkBnW) map[y][x] = BLACK;
		else map[y][x] = WHITE;
	}
	
	//승리 check
	public boolean winCheck(int x,int y){
		if(winCheckL(x, y)||winCheckLD(x, y)||winCheckLU(x, y)||winCheckR(x, y)
		||winCheckRD(x, y)||winCheckRU(x, y)||winCheckUp(x, y)||winCheckDown(x, y)
		||winCheckOneDown(x, y)||winCheckOneL(x, y)||winCheckOneLD(x, y)||winCheckOneLU(x, y)
		||winCheckOneR(x, y)||winCheckOneRD(x, y)||winCheckOneUp(x, y)||winCheckOneRU(x, y)
		||winCheckCenterLU(x, y)||winCheckCenterRL(x, y)||winCheckCenterRU(x, y)||winCheckCenterUD(x, y))
			return true;
		else
			return false;
	}
	
	//위쪽
	public boolean winCheckUp(int x,int y) {
		try{
			for(int i=y;i<y+5;i++){
				if(map[y][x]!=map[i][x])
					return false;
			}	
		}catch(ArrayIndexOutOfBoundsException e){
			return false;
		}
		
		return true;
	}
	//아래쪽
	public boolean winCheckDown(int x,int y) {
		try {
			for(int i=y;i>y-5;i--){
				if(map[y][x]!=map[i][x])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			return false;
		}
		
		return true;
	}
	//오른쪽 위 대각선
	public boolean winCheckRU(int x,int y) {
		try {
			for(int i=y, z=x;i>y-5;i--,z++){
				if(map[y][x]!=map[i][z])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			return false;
		}
		
		return true;
	}
	
	//왼쪽 위 대각선
	public boolean winCheckLU(int x,int y) {
		try {
			for(int i=y, z=x;i>y-5;i--,z--){
				if(map[y][x]!=map[i][z])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			return false;
		}
		
		return true;
	}
	
	//오른쪽
	public boolean winCheckR(int x,int y) {
		try {
			for(int z=x;z<x+5;z++){
				if(map[y][x]!=map[y][z])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			return false;
		}
		
		return true;
	}
	
	//왼쪽
	public boolean winCheckL(int x,int y) {
		try {
			for(int z=x;z>x-5;z--){
				if(map[y][x]!=map[y][z])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			return false;
		}
		
		return true;
	}
	
	//오른쪽 아래 대각선
	public boolean winCheckRD(int x,int y) {
		try {
			for(int i=y, z=x;i<y+5;i++,z++){
				if(map[y][x]!=map[i][z]||i>19||z>19||i<0||z<0)
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			return false;
		}
		
		return true;
	}
	
	//왼쪽 아래 대각선
	public boolean winCheckLD(int x,int y) {
		try {
			for(int i=y, z=x;i<y+5;i++,z--){
				if(map[y][x]!=map[i][z])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			return false;
		}
		
		return true;
	}
	//한칸 위쪽
	public boolean winCheckOneUp(int x,int y) {
		try{
			for(int i=y-1;i<y+4;i++){
				if(map[y][x]!=map[i][x])
					return false;
			}	
		}catch(ArrayIndexOutOfBoundsException e){
			return false;
		}
		
		return true;
	}
	//한칸 아래쪽
	public boolean winCheckOneDown(int x,int y) {
		try {
			for(int i=y+1;i>y-4;i--){
				if(map[y][x]!=map[i][x])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			return false;
		}
		
		return true;
	}
	//한칸 오른쪽 위 대각선
	public boolean winCheckOneRU(int x,int y) {
		try {
			for(int i=y+1, z=x-1;i>y-4;i--,z++){
				if(map[y][x]!=map[i][z])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			return false;
		}
		
		return true;
	}
	
	//한칸 왼쪽 위 대각선
	public boolean winCheckOneLU(int x,int y) {
		try {
			for(int i=y+1, z=x+1;i>y-4;i--,z--){
				if(map[y][x]!=map[i][z])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			return false;
		}
		
		return true;
	}
	
	//한칸 오른쪽
	public boolean winCheckOneR(int x,int y) {
		try {
			for(int z=x-1;z<x+4;z++){
				if(map[y][x]!=map[y][z])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			return false;
		}
		
		return true;
	}
	
	//한칸 왼쪽
	public boolean winCheckOneL(int x,int y) {
		try {
			for(int z=x+1;z>x-4;z--){
				if(map[y][x]!=map[y][z])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			return false;
		}
		
		return true;
	}
	
	//한칸 오른쪽 아래 대각선
	public boolean winCheckOneRD(int x,int y) {
		try {
			for(int i=y-1, z=x-1;i<y+4;i++,z++){
				if(map[y][x]!=map[i][z]||i>19||z>19||i<0||z<0)
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			return false;
		}
		
		return true;
	}
	
	//한칸 왼쪽 아래 대각선
	public boolean winCheckOneLD(int x,int y) {
		try {
			for(int i=y-1, z=x+1;i<y+4;i++,z--){
				if(map[y][x]!=map[i][z])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			return false;
		}
		
		return true;
	}
	//센터 업다운
	public boolean winCheckCenterUD(int x,int y) {
		try{
			for(int i=y-2;i<y+3;i++){
				if(map[y][x]!=map[i][x])
					return false;
			}	
		}catch(ArrayIndexOutOfBoundsException e){
			return false;
		}
		
		return true;
	}
	//센터 라이트 레프트
	public boolean winCheckCenterRL(int x,int y) {
		try {
			for(int z=x-2;z<x+3;z++){
				if(map[y][x]!=map[y][z])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			return false;
		}
		
		return true;
	}
	//센터 라이트 대각선
	public boolean winCheckCenterRU(int x,int y) {
		try {
			for(int i=y+2, z=x-2;i>y-3;i--,z++){
				if(map[y][x]!=map[i][z])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			return false;
		}
		
		return true;
	}
	//센터 레프트 대각선
	public boolean winCheckCenterLU(int x,int y) {
		try {
			for(int i=y+2, z=x+2;i>y-4;i--,z--){
				if(map[y][x]!=map[i][z])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			return false;
		}
		
		return true;
	}
}

class MouseEventHandler extends MouseAdapter {
	Map map;
	int x, y;
	MapSize ms;
	DrawBoard d;
	GUI main;
	
	public MouseEventHandler (Map map, MapSize ms, DrawBoard d, GUI main) {
		this.map = map;
		this.ms = ms;
		this.d = d;
		this.main = main;
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		super.mousePressed(e);
		
		int x = (int) Math.round(e.getX() / (double) ms.getCell()) - 1;
		int y = (int) Math.round(e.getY() / (double) ms.getCell()) - 2;
		if(x<0 || x>19 || y<0 || y>19) return;
		
		if(map.getXY(y, x) == map.getBlack() || map.getXY(y, x) == map.getWhite()) {
			return ;
		}
		
		map.setMap(y, x);
		map.changeCheck();
		d.repaint();
		
		if (map.winCheck(x, y)) {
			if(map.getCheck() == true) {
				main.showPopup("백돌 승리");
			} else {
				main.showPopup("흑돌 승리");
			}
		}
	}
}

class DrawBoard extends JPanel {
	private MapSize size;
	private Map map;
	private final int STONE_SIZE = 28;
	
	public DrawBoard(MapSize ms, Map map) {
		setBackground(new Color(210, 160, 95));
		this.size = ms;
		
		setLayout(null);
		this.map = map;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		board(g);
		drawStone(g);
	}
	
	public void board(Graphics g) {
		for(int i=1; i<=size.getSize(); i++) {
			//가로줄
			//시작x:30, 시작y:i(줄번호)*30, 끝x:600(20*30), 끝y:i*30
			g.drawLine(size.getCell(), i*size.getCell(),size.getCell()*size.getSize(), i*size.getCell());
			
			//세로줄
			//시작x:i*30, 시작y:30, 끝x:i*30, 끝y:600
			g.drawLine(i*size.getCell(), size.getCell(), i*size.getCell(), size.getCell()*size.getSize());
		}
	}
	
	public void drawStone(Graphics g) {
		for(int y=0;y<size.getSize();y++) {
			for(int x=0;x<size.getSize();x++) {
				if(map.getXY(y, x) == map.getBlack())
					drawBlack(g, x, y);
				else if(map.getXY(y, x) == map.getWhite())
					drawWhite(g, x, y);
			}
		}
	}
	
	public void drawBlack(Graphics g, int x, int y) {
		g.setColor(Color.black);
		g.fillOval((x+1)*size.getCell()-15, y*size.getCell()+15, STONE_SIZE, STONE_SIZE);
	}
	
	public void drawWhite(Graphics g, int x, int y) {
		g.setColor(Color.white);
		g.fillOval((x+1)*size.getCell()-15, y*size.getCell()+15, STONE_SIZE, STONE_SIZE);
	}
}

class GUI extends JFrame {
	MapSize size = new MapSize();
	
	public GUI(String title) {
		setTitle(title);			//Title
		setBounds(200, 100, 650, 700);		//위치 x,y,크기w,h
		
		Map map = new Map(size);
		DrawBoard d = new DrawBoard(size, map);
		setContentPane(d);
		
		addMouseListener(new MouseEventHandler(map, size, d, this));
		
		setVisible(true);			//창 보이기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void showPopup(String message) {
		JOptionPane.showMessageDialog(this, message, "축하합니다.", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}

public class Omok2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI ("오목게임");
	}

}
