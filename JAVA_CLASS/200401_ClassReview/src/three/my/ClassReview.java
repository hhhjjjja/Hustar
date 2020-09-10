package three.my;

//1번
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

//2번
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

//3번
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
		//1번 My 클래스의 객체가 몇개 생성되었는지 생성된 객체의 수를 알 수 있도록 My클래스의 멤버 완성
		System.out.println("-----1번-----");
		My my1 = new My();
		My my2 = new My();
		My my3 = new My();
		System.out.println("생성된 객체 수: "+My.countFn());
		
		//2번 cm를 인치변환, km을 마일변환, 평방미터를 평으로 변환하는 3개의 함수기능을 가지는 Danwi 클래스 생성
		System.out.println("\n-----2번-----");
		System.out.println(Danwi.cmToInch(10));
		System.out.println(Danwi.kmToMile(10));
		System.out.println(Danwi.mToSqp(10));
		
		//3번 너비와 높이 멤버데이터, 면적값을 제공하는 getArea()메소드를 가진 Rectangle 클래스
		System.out.println("\n-----3번-----");
		Rectangle rec = new Rectangle(2, 10);
		System.out.println(rec.getArea());
	}
}