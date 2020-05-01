//class
//������ �� ���� �ۼ��� �ڵ带 �ڹ� ������ ������ ����
//1. ��� �����ʹ� this.���������
//2. ��� �Լ��� ù��° ���ڿ� Ŭ�����̸� this
//3. ��ü.����Լ�(��ü);

//������ Ŭ�������� �������� ��ü�� ������ ���
//��������ʹ� ������ ����(������)�� �Ҵ��
//����Լ� �ڵ�� ����
//����Լ� ȣ��� ��� ������ ��ü�� ������ ���� write/read?
//this�� �����.

//fn1
class Test {
	public int a;
	public int b;
	public void setData(int x, int y) {
		a=x;
		b=y;
	}
	public void show() {
		System.out.printf("a=%d b=%d", a,b);
	}
}

//fn2
class Calendar{
	//public int month;
	private int month;		//private���ٱ����� �־ ���������� ���� �������� ���Ἲ ����
							//����Լ��� ���� �����͸� W/R "ĸ��ȭ"
	public void setMonth(int month) {
		if(month <=0 || month>12)
			System.out.println("wrong month");
		else
			this.month = month;
	}
	public int getMonth() {
		return this.month;
	}
}

//fn3, fn5
//�������Լ� : ��ü ������ �Ϸ�Ǹ� �ڵ�ȣ��Ǵ� �Լ�, �ʱⰪ ����
//Ŭ�����̸�() : �����ε�, ����Ÿ��X(void�� �Ⱦ�)
class Test3 {
	int a;
	int b;
	
	//default ������
	public Test3() {
		System.out.println("construct call");
		this.a=10;			//this.���� ����
		this.b=20;
	}
	//������ �����ε�
	public Test3(int x, int y) {
		System.out.println("arg construct call");
		a=x;
		b=y;
	}
	
	public void setData(int x, int y) {
		a=x;
		b=y;
	}
	public void show() {
		System.out.printf("a=%d b=%d\n", a,b);
	}
}

//fn4
//����� ������ �� Ŭ������ ������ �Լ��� �Ѱ��� �������� ������ ����Ʈ �����ڸ� �����Ϸ��� �߰���.
class My {
	int x;
	int y;
//	public My() {
//		
//	}
}


//fn6
class StClass {
	public int a;
	public int b;
	public static int st=100;
	public void setData(int x, int y) {
		a=x;
		b=y;
	}
	public static void setSt(int x) {
		st=x;
	}
	public static int getSt() {
		return st;
	}
	public void show() {
		System.out.printf("a=%d b=%d\n", a, b);
	}
	
	//public static void myfn() ���� �ϸ� this�� ����
	//Ŭ���� �Լ�
	public static void myfn() {		//StClass this
		st = 50;
		//a=100;					//static �޼ҵ�� �ν��Ͻ� ���� ���Ұ�
		//System.out.println(this);	//static ����Լ��� this���ڸ� ������ ����
	}
}

//alt + shisft + s
//������, getter, setter �ڵ�����
class Student {
	String name;
	int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class Circle {
	public static double circleArea(int r) {
		return r*r*3.14;
	}
	public static double cylinder(int r, int h) {
		return r*r*3.14*h;
	}
}

public class ThreeClassTest {
	
	public static void main(String[] args) {
		Student tt = new Student("���»�", 27);
		Student ss = new Student("������", 25);
		
		//static X
		Circle c = new Circle();
		System.out.println(c.circleArea(3));
		System.out.println(c.cylinder(3, 10));
		
		//static O -> �������鿡���� �� ����
		System.out.println(Circle.circleArea(3));
		System.out.println(Circle.cylinder(3, 10));
	}
	
	
	//fn5
	public static void testFn() {
		Test3 tt = new Test3();
		tt.show();
	}
	public static Test3 TestFn1() {
		Test3 tt = new Test3();
		tt.show();
		
		return tt;
	}
	
	public static void fn1() {
		//Ŭ���� ���� = ����Ÿ�Ժ��� (�ּҸ� �����ϴ� ����)
		//��������(��ü), ���������(����Լ�) : ���ٱ����� public�̾������ ���ٰ���
		//new Ŭ�����̸�() : �ش� Ŭ������ ��������͸� heap������ �Ҵ��ϰ� �Ҵ�� �����ּҸ� ��ȯ
		Test obj = new Test();		//Ŭ��������  obj
		
		//classTest ���� ���� a, b�� public���� �ָ� �̷��� ��밡��
		obj.a=100;	
		obj.b=200;
		
		obj.setData(10, 20);
		obj.show();
		
		System.out.println();
		Test ss = new Test();
		System.out.println(ss);	//�� ���� ss�ּҰ� ���
		ss.setData(100, 200);
		ss.show();
	}
	public static void fn2() {
		Calendar c = new Calendar();
//		c.month = 100;		//��� ������ �������� -> ������ ���Ἲ ����X
		c.setMonth(100);
	}
	public static void fn3() {
		Test3 tt= new Test3();
		//tt.Test3(tt); �� ������ ����(�����Ϸ� ����)
		tt.show();
		
		Test3 ss = new Test3(100, 200);
		ss.show();
	}
	public static void fn4() {
		My my = new My();
		System.out.println(my.x);
		System.out.println(my.y);
	}
	public static void fn5() {
//		testFn();
//		testFn();
		Test3 rst;
		rst = TestFn1();
		rst.show();
	}
	public static void fn6() {
		StClass.st = 1000;
		System.out.println(StClass.st);
		StClass tt = new StClass();
		tt.setData(10, 20);
		tt.show();
		
		StClass.myfn();
		System.out.println(StClass.st);
		
		StClass.setSt(33);
		System.out.println(StClass.getSt());
	}
}