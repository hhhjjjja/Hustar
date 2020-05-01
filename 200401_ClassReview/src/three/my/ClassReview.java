package three.my;

//1��
class My {
	private int a;
	private int b;
	private static int cnt=0;
	public My() {
		cnt++;
	}
	public static int countFn() {
		return cnt;
	}
}

//2��
class Danwi {
	public static double cmToInch(double cm) {
		return cm*0.393701;
	}
	public static double kmToMile(double km) {
		return km*0.621371;
	}
	public static double mToSqp(double m) {
		return m*0.3025;
	}
}

//3��
class Rectangle {
	private int width;
	private int height;
	
	public Rectangle() {
		width =0;
		height=0;
	}
	public Rectangle(int w, int h) {
		this.width = w;
		this.height = h;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public double getArea() {
		return width*height;
	}
}

public class ClassReview {

	public static void main(String[] args) {
		//1�� My Ŭ������ ��ü�� � �����Ǿ����� ������ ��ü�� ���� �� �� �ֵ��� MyŬ������ ��� �ϼ�
		System.out.println("-----1��-----");
		My my1 = new My();
		My my2 = new My();
		My my3 = new My();
		System.out.println("������ ��ü ��: "+My.countFn());
		
		//2�� cm�� ��ġ��ȯ, km�� ���Ϻ�ȯ, �����͸� ������ ��ȯ�ϴ� 3���� �Լ������ ������ Danwi Ŭ���� ����
		System.out.println("\n-----2��-----");
		System.out.println(Danwi.cmToInch(10));
		System.out.println(Danwi.kmToMile(10));
		System.out.println(Danwi.mToSqp(10));
		
		//3�� �ʺ�� ���� ���������, �������� �����ϴ� getArea()�޼ҵ带 ���� Rectangle Ŭ����
		System.out.println("\n-----3��-----");
		Rectangle rec = new Rectangle(2, 10);
		System.out.println(rec.getArea());
	}
}