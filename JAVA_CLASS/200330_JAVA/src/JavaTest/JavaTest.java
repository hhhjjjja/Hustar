package JavaTest;

import java.util.Scanner;

public class JavaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//형변환
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
		
		String s3 = ""+a;		//int -> String 형변환
		System.out.println(s3);
		
		byte b=10;
		int c = 20;
		b = (byte)c;
		System.out.println(b);
		
		char cc = 65;	//아스키코드 'A'
		System.out.println(cc);
	}
}

/*
 * //명명규칙(변수명, 함수명, 클래스명) //a-z, A-Z, 0-9, _조합에 의해서.. //숫자로 시작 X, 키워드 X(if,
 * while...)
 * 
 * //메모리는 반도체로 구성되어 있음
 * 
 * //정수타입 //총 4byte 공간, 공간 이름은 a, a공간에 10을 저장 int a; //4byte long b; //8byte
 * byte c; //1byte 통신 app ~ 서버(호스트, 소켓), 장치(시리얼 통신), 통신 기본단위 octet(8bit, 1byte)
 * 
 * 
 * //a = 3; //2진코드 //a = 0b11; //2진수 a = 0xA; //0~9 ABCDE 16진수 b = 10; c = 11;
 * 
 * System.out.println(a); System.out.println(b); System.out.println(c);
 * 
 * //실수타입 float f; //4byte, 3.124(지수, 가수) double d;
 * 
 * f = 3.14f; //그냥 3.14하면 error f붙여줘야 float. float보다 double사용 권장 d = 3.14;
 * 
 * System.out.println(f); System.out.println(d);
 * 
 * //boolean 타입 boolean bb; bb = true; //false
 * 
 * System.out.println(bb);
 * 
 * 
 * String s; //문자열 타입 쓴 만큼 바이트 char cc; //문자 타입 2byte
 * 
 * s = "abc"; //6byte cc = 'A';
 * 
 * System.out.println(s); System.out.println(cc);
 */

////표준 입력(키보드)
//int n;
//Scanner s = new Scanner(System.in);
//System.out.print("숫자입력 : ");
//n = s.nextInt();		//정수값 입력. 문자열 s.nextLine()
//System.out.println(n);
//
//
//// 표준 출력
//int a = 11;
//double b = 3.14;
//String s = "hello";
//
//System.out.printf("a=%d b=%f s=%s", a, b, s);
//System.out.println();
////%10d, 10.2%f 10은 10칸 띄우고, .2는 소숫점 둘째자리
//System.out.printf("a=%10d b=10.2%f s=%s", a, b, s);
//System.out.println();
//System.out.print("hello\n");
//System.out.println("Korea");



////*****연산자******
//int a = 5;
//int rst;
//double drst;
////rst = a*2;		//곱
////rst = a%2;		//나머지
//
//////정수 연산자 정수 : 정수
//////실수 연산자 정수 : 실수
//////정수 연산자 실수 : 실수
//////실수 연산자 실수 : 실수
////rst = a/2;		//나누기
////drst = a/2.0;	//.0안붙이면 2.0나옴 조심!
//
////rst = a + 3;	//덧셈
////rst = a - 3;	//뺄셈
//
////rst = 3+2*2-a%2;	//곱->나머지->+3->-	:6
//
////System.out.println(rst);
////System.out.println(drst);
//
////반지름(정수로)을 키보드로 입력받아 원의 면적을 구하시오.
//Scanner s = new Scanner(System.in);
//System.out.print("반지름:");
//int r = s.nextInt();
//double res;
//res = 3.14*r*r;
//System.out.println(res);




//비트연산
//int rst;

//rst = 3 & 2;		//비트 and 연산. 모두 1이면 1 둘중하나 0이면 0
//rst = -3 & 2;

//rst = 3 | 2;		//비트 or 연산. 모두 0이면 0 둘중하나 1이면 1
//rst = -3 | 2;
//rst = 3 ^ 2;		//비트 exclusive 연산. 모두 0이면 0 ,모두 1이면 0 둘중하나 1이면 1



//shift 연산
//int rst;
//rst = -3 << 1;		//좌시프트. 3을 왼쪽으로 한번
//rst = -3 << 1;
//rst = 3 >> 1;
//rst = -1 >> 1;
//rst = -3 >>> 1;		//우시프트의 경우 왼쪽 값이 양수면0 음수면 1로 채움
//System.out.println(rst);




//관계연산자
//int a=5;
//boolean rst;

//rst = a>0;		//T
//rst = a>=0;		//T
//rst = a<0;		//F
//rst = a<=0;		//F
//rst = a==0;		//F
//rst = a!=0;		//T
//System.out.println(rst);




//논리연산
//int a=5;
//boolean rst;

//rst = a>0 && a==0;	//모두 T면 T, 둘중 하나라도 F면 F
//rst = a==0 & a>0;	//모두 T면 T, 하나라도 F면 F
//rst = a>0 || a==0;	//모두 F면 F, 하나라도 T면 T

//단항연산
//!뒤에는 boolean Type
//rst = !(a>0);		//t->f, f->t
//
//System.out.println(rst);




//조건 연산자
//bool값? True인경우 : False인경우
//int a=5;
//int rst;
//rst = a>0? 100 : 200;		//a>0은T 이므로 100
//System.out.println(rst);


//문제. 하나의 정수를 키보드로부터 읽어 3의 배수면 3의배수
//아니면 3의배수 아님 출력
//Scanner s = new Scanner(System.in);
//
//System.out.print("정수 입력:");
//int n = s.nextInt();
//System.out.println((n%3)==0? "3의배수":"3의 배수 아님");