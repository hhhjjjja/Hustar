package test.ff;

public class Child extends Father {
	public int childVal;

	public Child() {
		System.out.println("Child constructor call");
		childVal=0;
	}

	public Child(int childVal) {
		super(1,2,3);	//father 정수인자 3개 받는 생성자
		System.out.println("Child arg constructor call");
		this.childVal = childVal;
	}
	
}