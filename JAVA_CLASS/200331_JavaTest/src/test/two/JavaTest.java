package test.two;

import java.util.Scanner;

public class JavaTest {	
	public static void main(String[] args) {
		
	}
}

////-----------------------------���------------------------------
////if��
////**����** �ϳ��� ���̸� �о� 20��� '20����' �ƴϸ�' 20�밡 �ƴմϴ�.' print
//Scanner s = new Scanner(System.in);
//System.out.print("AGE :");
//int age = s.nextInt();
//
//if(age>=20 && age<30)
//	System.out.println("20���Դϴ�.");
//else
//	System.out.println("20�밡 �ƴմϴ�.");
//
////if - else if - else
//int a = 5;
//if(a>0) {
//	System.out.println("ũ��");
//} else if(a==0) {
//	System.out.println("0�� ����");
//} else {
//	System.out.println("�۴�");
//}
//
//
////**����** �ϳ��� ������ �о
////90-100'A', 80-89'B', 70-79'C', 60-69'D', ������'F'
//int sc = s.nextInt();
//if(sc>=0 && a<=100) {
//	if (sc>=90 && sc<=100) {
//		System.out.println("A");
//	} else if(sc>=80 && sc<90) {
//		System.out.println("B");
//	} else if(sc>=70 && sc<80) {
//		System.out.println("C");
//	} else if(sc>=60 && sc<70) {
//		System.out.println("D");
//	} else {
//		System.out.println("F");
//	}
//} else {
//	System.out.println("0-100 ������ ���� �ԷµǾ�� �մϴ�.");
//}



////switch-case
//int n=5;
//switch(n) {
//case 1:
//	System.out.println("1");
//	break;
//case 2:
//	System.out.println("2");
//	break;
//default:
//	System.out.println("������");
//	break;
//}
//String s = "aa";
//switch(s) {
//case "aa":
//	System.out.println("aa");
//	break;
//case "bb":
//	System.out.println("bb");
//	break;
//default:
//	System.out.println("������");
//	break;
//}
//System.out.println("hello");
//
////**����** switch������
////0-100���� �Է� �����ؼ� ����..
//Scanner s = new Scanner(System.in);
//System.out.print("���� �Է�:");
//int score = s.nextInt();
//
//switch(score/10) {
//case 10:
//case 9:
//	System.out.println("A");
//	break;
//case 8:
//	System.out.println("B");
//	break;
//case 7:
//	System.out.println("C");
//	break;
//case 6:
//	System.out.println("D");
//	break;
//default:
//	System.out.println("F");
//	break;
//}
//
////**����** 20����, �ƴϸ� 20�밡 �ƴմϴ�. switch��
//System.out.print("����:");
//int age = s.nextInt();
//switch(age/10) {
//case 2:
//	System.out.println("20����");
//	break;
//default:
//	System.out.println("20�밡 �ƴ�");
//	break;
//}





////-----------------------------�ݺ���------------------------------
////while�� (�� �Ǵ�)
//int n=1;
//while(n<=5) {
//	if(n==3)
//		break;		//�ݺ��� ���� Ż�� Ű����
//	System.out.println("n="+n);
//	n++;
//}
//System.out.println("hello");
//
////**����** 1-10������ ���� ���Ͻÿ� (55)
//int n=1;
//int sum=0;
//while(n<=10) {
//	sum = sum + n;
//	n++;
//}
//System.out.println(sum);



////do-while��(�� �Ǵ�. �۾��� �ѹ��� �ݵ�� ����)
//int n=1;
//do {
//	System.out.println("n="+n);
//	n++;
//} while (n<=5);



////for��
//for(int n=1;n<=5;n++) {
//	if(n==3)
//		break;		//�ݺ��� Ż��
//		continue;	//Ż��X, �ݺ��� ����������.(3�� ������)
//	System.out.println(n);
//}
//
////**����** for���� �̿��Ͽ� 1-10���� �������� ǥ���ϰ� ���� ���.
////��� : 1+2+3+4+5+6+7+8+9+10=55
//int sum=0;
//for(int i=1;i<=10;i++) {
//	sum+=i;
//	System.out.print(i);
//	if(i==10)
//		continue;
//	System.out.print("+");
//}
//System.out.println("="+sum);
//
////**����** 1-10���� ���� �� 4�� ����� ������ ���ڸ� ���
//for(int i=1;i<=10;i++) {
//	if(i%4 == 0)
//		continue;
//	System.out.println(i);
//}



////do-while������ 'a'���� 'z'���� ���
////��� : abcdefg,,,,z
//char c = 'a';
//do {
//	System.out.print(c);
//	c++;
//} while(c<='z');



////��ø �ݺ���
//my: for(int n=1;n<=3;n++) {
//		for(int m=1;m<=3;m++) {
//			if(m==2)
//				break my;		//my(��)�����ִ� �ٱ� �ݺ����� Ż��
//				break;			//my�Ⱦ��� �ȿ� �ݺ����� Ż��
//			System.out.println("n="+n+", m="+m);
//		}
//}
//
////**����** ������
//for(int i=2;i<=9;i++) {
//	for(int j=1;j<=9;j++) {
//		System.out.println(i+" x "+j+" = "+i*j);
//	}
//	System.out.println();
//}
//
////**����** ������
////��� : 2x1=2 2x2=4...2x9=18
////..	9x1=9..
//for(int i=2;i<=9;i++) {
//	for(int j=1;j<=9;j++) {
//		System.out.print(i+" x "+j+" = "+i*j+"\t");
//	}
//	System.out.println();
//}



//---------------------------------�Լ�----------------------------------
////�Լ� ����� ���� : ����, �ڵ��� ������
//public static void fn() {			//�Է�X, ���(return)X
//	System.out.println("fn call");
//	System.out.println("hello");
//}
//public static int hap(int a, int b) {
//	return a+b;
//}
//
//public static void main(String[] args) {
//	fn();
//	System.out.println(hap(1, 2));
//}




////**����** cm�Է�(����) �޾Ƽ� ��ġ�� ��ȯ
//public static double cmToInch(int cm) {
//	return cm/2.54;
//}
//public static void main(String[] args) {
//	Scanner s = new Scanner(System.in);
//	System.out.print("cm:");
//	int cm = s.nextInt();
//	System.out.println("-> inch : " + cmToInch(cm));
//}

////**����** �ΰ��� ������ ���ڷ� �޾� ���밪�� ���� ��ȯ
//public static int sum(int a, int b) {
//	if (a<0) a*=-1;
//	if (b<0) b*=-1;
//	return a+b;
//}
//
//public static void main(String[] args) {
//	Scanner s = new Scanner(System.in);
//	System.out.print("a:");
//	int a = s.nextInt();
//	System.out.print("b:");
//	int b = s.nextInt();
//	
//	System.out.println("a+b=" + sum(a, b));
//}

////**����** ���� �Է¹޾Ƽ� ������
//public static boolean isLeap(int year) {
//	return (year%4==0 && year%100!=0) || year%400==0;
//}
//
//public static void main(String[] args) {
//	Scanner s = new Scanner(System.in);
//	System.out.print("year:");
//	int year = s.nextInt();
//	
//	System.out.println(isLeap(year)?"�����Դϴ�":"������ �ƴմϴ�");
//}


//(�������� : �Լ� ȣ�� �� �Ѿ�� ���� ������ ����)
//public static void vfn(String...str) {
//	//str : �迭
//	for (String s:str){
//		System.out.println(s);
//	}
//}
//
//public static void main(String[] args) {
//	vfn("aa", "bb", "cc", "dd");
//}



////�����ε� (�Լ��� �̸��� ���������� �ƱԸ�Ʈ�� Ÿ�� �Ǵ� ������ Ʋ�� ���)
//public static int hap(int a, int b) {
//	return a+b;
//}
//public static double hap(double a, double b) {
//	return a+b;
//}
//public static int hap(int a) {
//	return a*100;
//}
//
//public static void main(String[] args) {
//	System.out.println(hap(10, 20));
//	System.out.println(hap(10.2, 20.3));
//	System.out.println(hap(5));
//}



////generic function (�Ϲ�ȭ �Լ�)
//public static <T> T gFn(T r) {
//	return r;
//}
//
//public static void main(String[] args) {
//	System.out.println(gFn(10));
//	System.out.println(gFn(10.3));
//	System.out.println(gFn("abc"));
//}


