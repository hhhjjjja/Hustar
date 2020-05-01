package four.test;

public class Temporary extends Employee {
	private int pay;
	private int day;
	Temporary() {
		super("임꺽정", "부산시");
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
		System.out.printf("임시직 급여 : %d\n", GetPay() );
	}
	
}