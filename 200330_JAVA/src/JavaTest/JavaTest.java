package JavaTest;

import java.util.Scanner;

public class JavaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����ȯ
		//int <---> Integer
		//double <--->Double
		String s = "100";
		String s1 = "3.14";
		
		int n = Integer.parseInt(s);
		System.out.println(n);
		
		double d = Double.parseDouble(s1);
		System.out.println(d);
		
		int a = 3;
		String s2 = String.valueOf(a);
		System.out.println(s2);
		
		String s3 = ""+a;		//int -> String ����ȯ
		System.out.println(s3);
		
		byte b=10;
		int c = 20;
		b = (byte)c;
		System.out.println(b);
		
		char cc = 65;	//�ƽ�Ű�ڵ� 'A'
		System.out.println(cc);
	}
}

/*
 * //����Ģ(������, �Լ���, Ŭ������) //a-z, A-Z, 0-9, _���տ� ���ؼ�.. //���ڷ� ���� X, Ű���� X(if,
 * while...)
 * 
 * //�޸𸮴� �ݵ�ü�� �����Ǿ� ����
 * 
 * //����Ÿ�� //�� 4byte ����, ���� �̸��� a, a������ 10�� ���� int a; //4byte long b; //8byte
 * byte c; //1byte ��� app ~ ����(ȣ��Ʈ, ����), ��ġ(�ø��� ���), ��� �⺻���� octet(8bit, 1byte)
 * 
 * 
 * //a = 3; //2���ڵ� //a = 0b11; //2���� a = 0xA; //0~9 ABCDE 16���� b = 10; c = 11;
 * 
 * System.out.println(a); System.out.println(b); System.out.println(c);
 * 
 * //�Ǽ�Ÿ�� float f; //4byte, 3.124(����, ����) double d;
 * 
 * f = 3.14f; //�׳� 3.14�ϸ� error f�ٿ���� float. float���� double��� ���� d = 3.14;
 * 
 * System.out.println(f); System.out.println(d);
 * 
 * //boolean Ÿ�� boolean bb; bb = true; //false
 * 
 * System.out.println(bb);
 * 
 * 
 * String s; //���ڿ� Ÿ�� �� ��ŭ ����Ʈ char cc; //���� Ÿ�� 2byte
 * 
 * s = "abc"; //6byte cc = 'A';
 * 
 * System.out.println(s); System.out.println(cc);
 */

////ǥ�� �Է�(Ű����)
//int n;
//Scanner s = new Scanner(System.in);
//System.out.print("�����Է� : ");
//n = s.nextInt();		//������ �Է�. ���ڿ� s.nextLine()
//System.out.println(n);
//
//
//// ǥ�� ���
//int a = 11;
//double b = 3.14;
//String s = "hello";
//
//System.out.printf("a=%d b=%f s=%s", a, b, s);
//System.out.println();
////%10d, 10.2%f 10�� 10ĭ ����, .2�� �Ҽ��� ��°�ڸ�
//System.out.printf("a=%10d b=10.2%f s=%s", a, b, s);
//System.out.println();
//System.out.print("hello\n");
//System.out.println("Korea");



////*****������******
//int a = 5;
//int rst;
//double drst;
////rst = a*2;		//��
////rst = a%2;		//������
//
//////���� ������ ���� : ����
//////�Ǽ� ������ ���� : �Ǽ�
//////���� ������ �Ǽ� : �Ǽ�
//////�Ǽ� ������ �Ǽ� : �Ǽ�
////rst = a/2;		//������
////drst = a/2.0;	//.0�Ⱥ��̸� 2.0���� ����!
//
////rst = a + 3;	//����
////rst = a - 3;	//����
//
////rst = 3+2*2-a%2;	//��->������->+3->-	:6
//
////System.out.println(rst);
////System.out.println(drst);
//
////������(������)�� Ű����� �Է¹޾� ���� ������ ���Ͻÿ�.
//Scanner s = new Scanner(System.in);
//System.out.print("������:");
//int r = s.nextInt();
//double res;
//res = 3.14*r*r;
//System.out.println(res);




//��Ʈ����
//int rst;

//rst = 3 & 2;		//��Ʈ and ����. ��� 1�̸� 1 �����ϳ� 0�̸� 0
//rst = -3 & 2;

//rst = 3 | 2;		//��Ʈ or ����. ��� 0�̸� 0 �����ϳ� 1�̸� 1
//rst = -3 | 2;
//rst = 3 ^ 2;		//��Ʈ exclusive ����. ��� 0�̸� 0 ,��� 1�̸� 0 �����ϳ� 1�̸� 1



//shift ����
//int rst;
//rst = -3 << 1;		//�½���Ʈ. 3�� �������� �ѹ�
//rst = -3 << 1;
//rst = 3 >> 1;
//rst = -1 >> 1;
//rst = -3 >>> 1;		//�����Ʈ�� ��� ���� ���� �����0 ������ 1�� ä��
//System.out.println(rst);




//���迬����
//int a=5;
//boolean rst;

//rst = a>0;		//T
//rst = a>=0;		//T
//rst = a<0;		//F
//rst = a<=0;		//F
//rst = a==0;		//F
//rst = a!=0;		//T
//System.out.println(rst);




//������
//int a=5;
//boolean rst;

//rst = a>0 && a==0;	//��� T�� T, ���� �ϳ��� F�� F
//rst = a==0 & a>0;	//��� T�� T, �ϳ��� F�� F
//rst = a>0 || a==0;	//��� F�� F, �ϳ��� T�� T

//���׿���
//!�ڿ��� boolean Type
//rst = !(a>0);		//t->f, f->t
//
//System.out.println(rst);




//���� ������
//bool��? True�ΰ�� : False�ΰ��
//int a=5;
//int rst;
//rst = a>0? 100 : 200;		//a>0��T �̹Ƿ� 100
//System.out.println(rst);


//����. �ϳ��� ������ Ű����κ��� �о� 3�� ����� 3�ǹ��
//�ƴϸ� 3�ǹ�� �ƴ� ���
//Scanner s = new Scanner(System.in);
//
//System.out.print("���� �Է�:");
//int n = s.nextInt();
//System.out.println((n%3)==0? "3�ǹ��":"3�� ��� �ƴ�");