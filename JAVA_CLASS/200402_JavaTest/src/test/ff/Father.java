package test.ff;

public class Father {				//extends Object 가 default로 있음
	public int pubVal;
	protected int proVal;
	private int priVal;
	
	public Father() {
		System.out.println("Father constructor call");
		pubVal=0;
		proVal=0;
		priVal=0;
	}
	public Father(int pubVal, int proVal, int priVal) {
		System.out.println("Father arg constructor call");
		this.pubVal=pubVal;
		this.priVal=priVal;
		this.proVal=proVal;
	}
	public void setPriVal(int a) {
		priVal=a;
	}
	public int setPriVal() {
		return priVal;
	}
	public void pubFn() {
		System.out.println("pubFn");
	}
	protected void proFn() {
		System.out.println("proFn");
	}
	private void priFn() {
		System.out.println("priFn");
	}
}