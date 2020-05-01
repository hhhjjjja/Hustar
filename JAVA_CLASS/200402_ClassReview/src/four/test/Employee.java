package four.test;


/* 아래의 클래스를 상속받아 
Permanant(연봉), Temporary(시간당급여, 일한날짜), Mangager(연봉, 담당부서)
클래스를 정의하고 사원정보(이름, 주소, 급여, 직급등)를 출력하시요.*/
abstract class Employee {
	String name;
	String addr;
	public Employee() {}
	public Employee(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}
	void ShowYourName() { System.out.println(name); }
	void ShowYourAddr() { System.out.println(addr); }
	public abstract int GetPay();
	public abstract void ShowSalaryInfo();
	
	
	public static void main(String[] args) {
		Permanant kim = new Permanant();
		kim.setS(2000);
		kim.ShowYourName();
		kim.ShowYourAddr();
		kim.ShowSalaryInfo();
		
		Manager lee = new Manager();
		lee.setS(3000);
		lee.ShowYourName();
		lee.ShowYourAddr();
		lee.ShowSalaryInfo();
		
		Temporary lim = new Temporary();
		lim.setData(20, 5);
		lim.ShowYourName();
		lim.ShowYourAddr();
		lim.ShowSalaryInfo();
	}
}