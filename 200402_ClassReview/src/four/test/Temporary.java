package four.test;

public class Temporary extends Employee {
	private int pay;
	private int day;
	Temporary() {
		super("�Ӳ���", "�λ��");
	}
	public void setData(int day, int pay) {
		this.day=day;
		this.pay=pay;
	}

	@Override
	public int GetPay() {
		// TODO Auto-generated method stub
		return day*pay;
	}

	@Override
	public void ShowSalaryInfo() {
		// TODO Auto-generated method stub
		System.out.printf("�ӽ��� �޿� : %d\n", GetPay() );
	}
	
}