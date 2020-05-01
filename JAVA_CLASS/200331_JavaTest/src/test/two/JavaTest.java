package test.two;

import java.util.Scanner;

public class JavaTest {	
	public static void main(String[] args) {
		
	}
}

////-----------------------------제어문------------------------------
////if문
////**문제** 하나의 나이를 읽어 20대면 '20대임' 아니면' 20대가 아닙니다.' print
//Scanner s = new Scanner(System.in);
//System.out.print("AGE :");
//int age = s.nextInt();
//
//if(age>=20 && age<30)
//	System.out.println("20대입니다.");
//else
//	System.out.println("20대가 아닙니다.");
//
////if - else if - else
//int a = 5;
//if(a>0) {
//	System.out.println("크다");
//} else if(a==0) {
//	System.out.println("0과 같다");
//} else {
//	System.out.println("작다");
//}
//
//
////**문제** 하나의 점수를 읽어서
////90-100'A', 80-89'B', 70-79'C', 60-69'D', 나머지'F'
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
//	System.out.println("0-100 사이의 값이 입력되어야 합니다.");
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
//	System.out.println("나머지");
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
//	System.out.println("나머지");
//	break;
//}
//System.out.println("hello");
//
////**문제** switch문으로
////0-100사이 입력 가정해서 점수..
//Scanner s = new Scanner(System.in);
//System.out.print("점수 입력:");
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
////**문제** 20대임, 아니면 20대가 아닙니다. switch로
//System.out.print("나이:");
//int age = s.nextInt();
//switch(age/10) {
//case 2:
//	System.out.println("20대임");
//	break;
//default:
//	System.out.println("20대가 아님");
//	break;
//}





////-----------------------------반복문------------------------------
////while문 (선 판단)
//int n=1;
//while(n<=5) {
//	if(n==3)
//		break;		//반복문 강제 탈출 키워드
//	System.out.println("n="+n);
//	n++;
//}
//System.out.println("hello");
//
////**문제** 1-10까지의 합을 구하시오 (55)
//int n=1;
//int sum=0;
//while(n<=10) {
//	sum = sum + n;
//	n++;
//}
//System.out.println(sum);



////do-while문(후 판단. 작업문 한번은 반드시 실행)
//int n=1;
//do {
//	System.out.println("n="+n);
//	n++;
//} while (n<=5);



////for문
//for(int n=1;n<=5;n++) {
//	if(n==3)
//		break;		//반복문 탈출
//		continue;	//탈출X, 반복문 시작점으로.(3만 안찍힘)
//	System.out.println(n);
//}
//
////**문제** for문을 이용하여 1-10까지 덧셈으로 표시하고 합을 출력.
////출력 : 1+2+3+4+5+6+7+8+9+10=55
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
////**문제** 1-10까지 숫자 중 4의 배수를 제외한 숫자를 출력
//for(int i=1;i<=10;i++) {
//	if(i%4 == 0)
//		continue;
//	System.out.println(i);
//}



////do-while문으로 'a'부터 'z'까지 출력
////결과 : abcdefg,,,,z
//char c = 'a';
//do {
//	System.out.print(c);
//	c++;
//} while(c<='z');



////중첩 반복문
//my: for(int n=1;n<=3;n++) {
//		for(int m=1;m<=3;m++) {
//			if(m==2)
//				break my;		//my(라벨)써져있는 바깥 반복문도 탈출
//				break;			//my안쓰면 안에 반복문만 탈출
//			System.out.println("n="+n+", m="+m);
//		}
//}
//
////**문제** 구구단
//for(int i=2;i<=9;i++) {
//	for(int j=1;j<=9;j++) {
//		System.out.println(i+" x "+j+" = "+i*j);
//	}
//	System.out.println();
//}
//
////**문제** 구구단
////출력 : 2x1=2 2x2=4...2x9=18
////..	9x1=9..
//for(int i=2;i<=9;i++) {
//	for(int j=1;j<=9;j++) {
//		System.out.print(i+" x "+j+" = "+i*j+"\t");
//	}
//	System.out.println();
//}



//---------------------------------함수----------------------------------
////함수 사용의 목적 : 재사용, 코드의 가독성
//public static void fn() {			//입력X, 출력(return)X
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




////**문제** cm입력(인자) 받아서 인치를 반환
//public static double cmToInch(int cm) {
//	return cm/2.54;
//}
//public static void main(String[] args) {
//	Scanner s = new Scanner(System.in);
//	System.out.print("cm:");
//	int cm = s.nextInt();
//	System.out.println("-> inch : " + cmToInch(cm));
//}

////**문제** 두개의 정수를 인자로 받아 절대값의 합을 반환
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

////**문제** 연도 입력받아서 윤년계산
//public static boolean isLeap(int year) {
//	return (year%4==0 && year%100!=0) || year%400==0;
//}
//
//public static void main(String[] args) {
//	Scanner s = new Scanner(System.in);
//	System.out.print("year:");
//	int year = s.nextInt();
//	
//	System.out.println(isLeap(year)?"윤년입니다":"윤년이 아닙니다");
//}


//(가변인자 : 함수 호출 시 넘어가는 값의 제한이 없다)
//public static void vfn(String...str) {
//	//str : 배열
//	for (String s:str){
//		System.out.println(s);
//	}
//}
//
//public static void main(String[] args) {
//	vfn("aa", "bb", "cc", "dd");
//}



////오버로딩 (함수의 이름은 동일하지만 아규먼트의 타입 또는 갯수가 틀린 경우)
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



////generic function (일반화 함수)
//public static <T> T gFn(T r) {
//	return r;
//}
//
//public static void main(String[] args) {
//	System.out.println(gFn(10));
//	System.out.println(gFn(10.3));
//	System.out.println(gFn("abc"));
//}


