package project01.my;

import java.util.Scanner;

public class project01 {
	public static void main(String[] args) {
		//1��
		int r, h;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������: ");
		r = scan.nextInt();
		System.out.print("����: ");
		h = scan.nextInt();
		
		//1) ������� ����
		System.out.println("������� ���� = " + (r*r*3.14*h));
		//2) ������ ����
		System.out.println("������ ���� = " + (r*r*h*3.14/3));
		System.out.println("----------------------\n");
		
		
		//2 �ϳ��� ���� �Է¹޾� ȭ���� ���ϱ�
		System.out.println("����->ȭ��");
		System.out.print("���� : ");
		int c = scan.nextInt();
		System.out.println("ȭ���� : "+ (c*1.8+32));
		System.out.println("----------------------\n");
		
		//3 cm->inch
		System.out.println("cm -> inch");
		System.out.print("CM �Է� : ");
		int cm = scan.nextInt();
		System.out.println("inch ��ȯ : " + (cm*0.393701));
		System.out.println("----------------------\n");
		
		//4 km->����
		System.out.println("km -> ����");
		System.out.print("km �Է� :");
		int km = scan.nextInt();
		System.out.println("km -> ���� ��ȯ : " + (km*0.6213));
		System.out.println("----------------------\n");
		
		//5 2���� �����Է¹޾� ���밪�� ���� ���ϱ�
		System.out.println("2���� ������ �Է¹޾� ���밪�� �� ���ϱ�");
		int n1, n2;
		System.out.print("ù��° ���� : ");
		n1 = scan.nextInt();
		System.out.print("�ι�° ���� : ");
		n2 = scan.nextInt();
		
		n1 = n1<0 ? -n1:n1;
		n2 = n2<0 ? -n2:n2;
		
		System.out.println("������ ���� ��� :" + (n1+n2));
		System.out.println("----------------------\n");
		
		//6. -5 >> 2 ������ ������� ���� ������ ��Ʈ ���� ������ ����
		System.out.println("6�� -5 >> 2");
		System.out.println("-5 >> 2 = " + (-5>>2));
		//-5 : 1111...1011
		//2shift : 1111...1110
		//2�Ǻ��� : 0000...0010 (2)
		//��� : -2
		System.out.println("----------------------\n");
		
		//7 3���� ������ �Է¹޾� ���� ū�� ���ϱ�
		int a1, a2, a3;
		System.out.println("3���� ������ �Է¹޾� ���� ū �� ���ϱ�");
		System.out.print("ù��°���� �Է�: ");
		a1 = scan.nextInt();
		System.out.print("�ι�°���� �Է�: ");
		a2 = scan.nextInt();
		System.out.print("����°���� �Է�: ");
		a3 = scan.nextInt();
		
		int f;
		f = a1>a2 ? a1 : a2;
		f = f>a3 ? f : a3;
		System.out.println("���� ū ���� "+ f );
		System.out.println("----------------------\n");
		
		//8 �⵵�� �Է¹޾� ���� ���θ� ��� (����: n%4=0, n%100!=0)
		System.out.println("������");
		System.out.print("�⵵ �Է�:");
		int year = scan.nextInt();
		boolean tf;
		tf = (year%4 == 0) && (year % 100 != 0) || (year%400 == 0);
		System.out.println(tf?"����O":"����X");
		System.out.println("----------------------\n");
		
		//9 ��ǰ���ݰ� ���Ҿ��Է�, �Ž������� ������ �ּ�ȭ�ϵ��� �Ž����� ���
		//�Ž����� ������ 500, 100, 50, 10�� 4����
		System.out.println("�ּ� �Ž����� ����");
		System.out.print("��ǰ����:");
		int product = scan.nextInt();
		System.out.print("���Ҿ�:");
		int pay = scan.nextInt();
		int change = pay - product;
		int n500 = change/50;
		change = change%500;
		int n100 = change/100;
		change = change%100;
		int n50 = change/50;
		change = change%50;
		int n10 = change/10;
		change = change%10;
		System.out.printf("500��:%d��, 100��:%d��, 50��:%d��, 10��:%d��", n500, n100,n50,n10);
		
		//10 �ϳ��� ������ �Է¹޾� 3�� ����̸� '3�� �����' �ƴϸ� '3�� ����� �ƴ�' ���
		
		//11 int a=2;	int rst = 2+2*3+a++;�� �������� 	=>	
		
		//12 �Ʒ��� �ڵ�� ����� ��µ� �ʿ��� �ٱ���(����)�� ���� ���ϴ� �ڵ��̴�.
		//���� ����� ���� 123���̰� �ϳ��� �ٱ��Ͽ��� 10���� ����� ���� �� �ִٸ�,
		//12���� �ٱ��ϰ� �ʿ��� ���̴�. (1)�� �˸��� �ڵ带 �����ÿ�.
		int numOfApples = 123;			//����� ����
		int sizeOfBucket = 10;			//�ٱ��� ũ��
		//int numOfBucket = (/* (1) */);
		int numOfBucket = numOfApples%sizeOfBucket==0 ? numOfApples/sizeOfBucket : numOfApples/sizeOfBucket+1;
		System.out.println("�ʿ��� �ٱ����� ��:" + numOfBucket);
		
		//13 ������(�� 5000) �Է¹޾� ���� 3.3�� ���� �Ǽ��ɾ��� ���Ͻÿ�
		System.out.print("����:");
		int salary = scan.nextInt();
		System.out.println("�Ǽ��ɾ� : " + (salary*(1-0.033)));
		
		//14 char c= 'A' �� �ҹ��ڷ� �����Ͻÿ�
		char cc= 'A';
		System.out.println(cc+32);
	}
}