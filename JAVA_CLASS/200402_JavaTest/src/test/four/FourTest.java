package test.four;

import test.ff.*;

//�������̽� : ��� �߻��Լ��θ� ������
interface IAnimal {
	public void Live();
	public void Die();
}
interface Machine {
	public void Leg();
}

//���߻��
class Fish implements IAnimal, Machine {
	//������̼�
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

//�߻�Ŭ����
//��ӹ޴� Ŭ������ �߻� �Լ��� �ݵ��! �������̵� �ؾ��Ѵ�
//�߻�Ŭ������ ��ü�����Ұ�
abstract class Pet {
	public void Sleep() {
		System.out.println("zzz");
	}
	abstract public void Eat();	//�߻��Լ��� 1���̻� ������ Ŭ������ �ݵ�� abstract
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
	
	//�������̵�(������) : ����Ŭ���� �Լ��� �ٽ� �����ؼ� ����ϴ� ��
	@Override
	public void Eat() {
		System.out.println("fish");
	}
}

public class FourTest {
	public static void PetEat(Pet pet) {
		pet.Eat();			//�ε�Ÿ�ӿ� ���ε�x
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ü�� ������(����������) : ����Ŭ������ ���������� ����Ŭ������ ��ü�� �޴´�
		//abstract, interface ������ ^^
		//abstract �Լ��� �������̵��� �Լ��� �ε�Ÿ�ӿ� ���ε������ʰ� ��Ÿ�ӽ� ���ε�.
		Pet pet = new Dog();
		pet.Sleep();
		pet.Eat();
		
		PetEat(new Dog());
		PetEat(new Cat());
	}
}


/*
 //�ٸ� ��Ű�� ���� import���ֱ�
import test.mypack.*;

Test obj = new Test();
obj.a=10;
System.out.println(obj.a);

My my = new My();
//my.x=100;
Sample s= new Sample();
*/



/*
class Father {				//extends Object �� default�� ����
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
c.proVal = 30;	//������ ��Ű���� �ܺ����������� ������ �ٸ���Ű���̸� ���ο�����
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
	//�������̵�(������) : ����Ŭ���� �Լ��� �ٽ� �����ؼ� ����ϴ� ��
	public void Eat() {
		System.out.println("fish");
	}
}
*/


