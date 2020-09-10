import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//MapSize ��ü �ٵ��� ũ�� ����
class MapSize {
	final int CELL = 30;		//�� ĭ ũ��
	final int SIZE = 20;		//line ��
	public int getCell() {
		return CELL;
	}
	public int getSize() {
		return SIZE;
	}
}


//Map �� ��ġ, �� ����
class Map {
	short[][] map;				//�� �迭 1�϶� ��, -1�϶� ��, 0�϶� ��X
	final short BLACK = 1;
	final short WHITE = -1;
	boolean checkBnW = true;	//��� ����
	
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
	
	//checkBnW Ȯ���ؼ� true�� map�� Black, false�� white
	public void setMap(int y, int x) {
		if(checkBnW) map[y][x] = BLACK;
		else map[y][x] = WHITE;
	}
	
	//�¸� check
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
	
	//����
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
	//�Ʒ���
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
	//������ �� �밢��
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
	
	//���� �� �밢��
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
	
	//������
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
	
	//����
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
	
	//������ �Ʒ� �밢��
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
	
	//���� �Ʒ� �밢��
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
	//��ĭ ����
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
	//��ĭ �Ʒ���
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
	//��ĭ ������ �� �밢��
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
	
	//��ĭ ���� �� �밢��
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
	
	//��ĭ ������
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
	
	//��ĭ ����
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
	
	//��ĭ ������ �Ʒ� �밢��
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
	
	//��ĭ ���� �Ʒ� �밢��
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
	//���� ���ٿ�
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
	//���� ����Ʈ ����Ʈ
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
	//���� ����Ʈ �밢��
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
	//���� ����Ʈ �밢��
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
				main.showPopup("�鵹 �¸�");
			} else {
				main.showPopup("�浹 �¸�");
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
			//������
			//����x:30, ����y:i(�ٹ�ȣ)*30, ��x:600(20*30), ��y:i*30
			g.drawLine(size.getCell(), i*size.getCell(),size.getCell()*size.getSize(), i*size.getCell());
			
			//������
			//����x:i*30, ����y:30, ��x:i*30, ��y:600
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
		setBounds(200, 100, 650, 700);		//��ġ x,y,ũ��w,h
		
		Map map = new Map(size);
		DrawBoard d = new DrawBoard(size, map);
		setContentPane(d);
		
		addMouseListener(new MouseEventHandler(map, size, d, this));
		
		setVisible(true);			//â ���̱�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void showPopup(String message) {
		JOptionPane.showMessageDialog(this, message, "�����մϴ�.", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}

public class Omok2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI ("�������");
	}

}
