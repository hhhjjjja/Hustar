//class
//컴파일 시 내가 작성한 코드를 자바 컴파일 강제로 변경
//1. 멤버 데이터는 this.멤버데이터
//2. 멤버 함수는 첫번째 인자에 클래스이름 this
//3. 객체.멤버함수(객체);

//동일한 클래스에서 여러개의 객체가 생성된 경우
//멤버데이터는 별도의 영역(힙영역)에 할당됨
//멤버함수 코드로 공유
//멤버함수 호출시 어떻게 각각의 객체의 영역에 값을 write/read?
//this로 제어됨.

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
	private int month;		//private접근권한자 주어서 직접접근을 막고 데이터의 무결성 보장
							//멤버함수를 통해 데이터를 W/R "캡슐화"
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
//생성자함수 : 객체 생성이 완료되면 자동호출되는 함수, 초기값 지정
//클래스이름() : 오버로딩, 리턴타입X(void도 안씀)
class Test3 {
	int a;
	int b;
	
	//default 생성자
	public Test3() {
		System.out.println("construct call");
		this.a=10;			//this.생략 가능
		this.b=20;
	}
	//생성자 오버로딩
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
//기계어로 번역할 때 클래스에 생성자 함수를 한개도 정의하지 않으면 디폴트 생성자를 컴파일러가 추가함.
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
	
	//public static void myfn() 으로 하면 this에 오류
	//클래스 함수
	public static void myfn() {		//StClass this
		st = 50;
		//a=100;					//static 메소드는 인스턴스 변수 사용불가
		//System.out.println(this);	//static 멤버함수는 this인자를 만들지 않음
	}
}

//alt + shisft + s
//생성자, getter, setter 자동생성
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
		Student tt = new Student("안태산", 27);
		Student ss = new Student("박현정", 25);
		
		//static X
		Circle c = new Circle();
		System.out.println(c.circleArea(3));
		System.out.println(c.cylinder(3, 10));
		
		//static O -> 성능측면에서는 더 좋음
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
		//클래스 변수 = 참조타입변수 (주소를 저장하는 변수)
		//참조변수(객체), 멤버데이터(멤버함수) : 접근권한이 public이어야지만 접근가능
		//new 클래스이름() : 해당 클래스의 멤버데이터를 heap영역에 할당하고 할당된 시작주소를 반환
		Test obj = new Test();		//클래스변수  obj
		
		//classTest 내의 변수 a, b를 public으로 주면 이렇게 사용가능
		obj.a=100;	
		obj.b=200;
		
		obj.setData(10, 20);
		obj.show();
		
		System.out.println();
		Test ss = new Test();
		System.out.println(ss);	//힙 내의 ss주소값 출력
		ss.setData(100, 200);
		ss.show();
	}
	public static void fn2() {
		Calendar c = new Calendar();
//		c.month = 100;		//멤버 데이터 직접접근 -> 데이터 무결성 보장X
		c.setMonth(100);
	}
	public static void fn3() {
		Test3 tt= new Test3();
		//tt.Test3(tt); 이 숨겨져 있음(컴파일러 개입)
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