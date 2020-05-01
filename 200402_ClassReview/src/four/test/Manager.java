package four.test;

public class Manager extends Employee {
	
	private int s;
	Manager() {
		super("이순신", "서울시 강남구");
	}
	public void setS(int s) {
		this.s = s;
	}

	@Override
	public int GetPay() {
		// TODO Auto-generated method stub
		return s;
	}

	@Override
	public void ShowSalaryInfo() {
		// TODO Auto-generated method stub
		System.out.printf("영구직급여 : %d\n", GetPay());
	}
}