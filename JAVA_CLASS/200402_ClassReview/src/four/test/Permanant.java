package four.test;

public class Permanant extends Employee {
	
	private int s;
	Permanant() {
		super("±èÃ¶¼ö", "±¤ÁÖ½Ã");
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
		System.out.printf("¿µ±¸Á÷±Þ¿© : %d\n", GetPay());
	}
	
}