package four.test;

public class Permanant extends Employee {
	
	private int s;
	Permanant() {
		super("��ö��", "���ֽ�");
	}
	public void setS(int n) {
		this.s=n;
	}

	@Override
	public int GetPay() {
		// TODO Auto-generated method stub
		return s;
	}

	@Override
	public void ShowSalaryInfo() {
		// TODO Auto-generated method stub
		System.out.printf("�������޿� : %d\n", GetPay());
	}
	
}