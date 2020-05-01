package test.ff;

public class Baby extends Child{
	public int babyVal;

	public Baby() {
		System.out.println("Baby construct call");
		babyVal=0;
	}
	public Baby(int babyVal) {
		super(babyVal);		//child »ý¼ºÀÚ
		System.out.println("Baby arg construct call");
		this.babyVal = babyVal;
	}
	public void babyFn() {
		proVal = 40;
	}
}
