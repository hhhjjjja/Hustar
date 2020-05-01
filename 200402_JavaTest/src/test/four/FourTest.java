package test.four;

import test.ff.*;

//인터페이스 : 모두 추상함수로만 구성됨
interface IAnimal {
	public void Live();
	public void Die();
}
interface Machine {
	public void Leg();
}

//다중상속
class Fish implements IAnimal, Machine {
	//어노테이션
	@Override
	public void Live() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Die() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Leg() {
		// TODO Auto-generated method stub
		
	}
}

//추상클래스
//상속받는 클래스는 추상 함수를 반드시! 오버라이딩 해야한다
//추상클래스는 객체생성불가
abstract class Pet {
	public void Sleep() {
		System.out.println("zzz");
	}
	abstract public void Eat();	//추상함수를 1개이상 포함한 클래스는 반드시 abstract
}

class Dog extends Pet {
	public void Speak() {
		System.out.println("bow wow");
	}

	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		System.out.println("bone");
	}
}

class Cat extends Pet {
	public void Speak() {
		System.out.println("meaw");
	}
	
	//오버라이딩(재정의) : 상위클래스 함수를 다시 정의해서 사용하는 것
	@Override
	public void Eat() {
		System.out.println("fish");
	}
}

public class FourTest {
	public static void PetEat(Pet pet) {
		pet.Eat();			//로딩타임에 바인딩x
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체의 다형성(폴리모피즘) : 상위클래스의 참조변수가 하위클래스의 객체를 받는다
		//abstract, interface 사용목적 ^^
		//abstract 함수와 오버라이딩한 함수는 로딩타임에 바인딩하지않고 런타임시 바인딩.
		Pet pet = new Dog();
		pet.Sleep();
		pet.Eat();
		
		PetEat(new Dog());
		PetEat(new Cat());
	}
}


/*
 //다른 패키지 사용시 import해주기
import test.mypack.*;

Test obj = new Test();
obj.a=10;
System.out.println(obj.a);

My my = new My();
//my.x=100;
Sample s= new Sample();
*/



/*
class Father {				//extends Object 가 default로 있음
	public int pubVal;
	protected int proVal;
	private int priVal;
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

class Child extends Father {
	public int childVal;
}


Father f = new Father();
Child c = new Child();
c.childVal = 10;
c.pubVal = 20;
c.proVal = 30;	//동일한 패키지는 외부직접접근이 되지만 다른패키지이면 내부에서만
c.pubFn();
c.proFn();
*/

/*
class Pet {
	public void Sleep() {
		System.out.println("zzz");
	}
	public void Eat() {
		System.out.println("???");
	}
}

class Dog extends Pet {
	public void Speak() {
		System.out.println("bow wow");
	}
	public void Eat() {
		System.out.println("bone");
	}
}

class Cat extends Pet {
	public void Speak() {
		System.out.println("meaw");
	}
	//오버라이딩(재정의) : 상위클래스 함수를 다시 정의해서 사용하는 것
	public void Eat() {
		System.out.println("fish");
	}
}
*/


