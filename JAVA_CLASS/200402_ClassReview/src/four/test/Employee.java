package four.test;


/* �Ʒ��� Ŭ������ ��ӹ޾� 
Permanant(����), Temporary(�ð���޿�, ���ѳ�¥), Mangager(����, ���μ�)
Ŭ������ �����ϰ� �������(�̸�, �ּ�, �޿�, ���޵�)�� ����Ͻÿ�.*/
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