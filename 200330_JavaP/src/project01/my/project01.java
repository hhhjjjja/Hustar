package project01.my;

import java.util.Scanner;

public class project01 {
	public static void main(String[] args) {
		//1번
		int r, h;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("반지름: ");
		r = scan.nextInt();
		System.out.print("높이: ");
		h = scan.nextInt();
		
		//1) 원기둥의 부피
		System.out.println("원기둥의 부피 = " + (r*r*3.14*h));
		//2) 원뿔의 부피
		System.out.println("원뿔의 부피 = " + (r*r*h*3.14/3));
		System.out.println("----------------------\n");
		
		
		//2 하나의 도를 입력받아 화씨값 구하기
		System.out.println("섭씨->화씨");
		System.out.print("섭씨 : ");
		int c = scan.nextInt();
		System.out.println("화씨값 : "+ (c*1.8+32));
		System.out.println("----------------------\n");
		
		//3 cm->inch
		System.out.println("cm -> inch");
		System.out.print("CM 입력 : ");
		int cm = scan.nextInt();
		System.out.println("inch 변환 : " + (cm*0.393701));
		System.out.println("----------------------\n");
		
		//4 km->마일
		System.out.println("km -> 마일");
		System.out.print("km 입력 :");
		int km = scan.nextInt();
		System.out.println("km -> 마일 변환 : " + (km*0.6213));
		System.out.println("----------------------\n");
		
		//5 2개의 정수입력받아 절대값의 합을 구하기
		System.out.println("2개의 정수를 입력받아 절대값의 합 구하기");
		int n1, n2;
		System.out.print("첫번째 정수 : ");
		n1 = scan.nextInt();
		System.out.print("두번째 정수 : ");
		n2 = scan.nextInt();
		
		n1 = n1<0 ? -n1:n1;
		n2 = n2<0 ? -n2:n2;
		
		System.out.println("절댓값을 더한 결과 :" + (n1+n2));
		System.out.println("----------------------\n");
		
		//6. -5 >> 2 연산의 결과값에 대해 이유를 비트 연산 순서로 나열
		System.out.println("6번 -5 >> 2");
		System.out.println("-5 >> 2 = " + (-5>>2));
		//-5 : 1111...1011
		//2shift : 1111...1110
		//2의보수 : 0000...0010 (2)
		//결과 : -2
		System.out.println("----------------------\n");
		
		//7 3개의 정수를 입력받아 가장 큰값 구하기
		int a1, a2, a3;
		System.out.println("3개의 정수를 입력받아 가장 큰 값 구하기");
		System.out.print("첫번째정수 입력: ");
		a1 = scan.nextInt();
		System.out.print("두번째정수 입력: ");
		a2 = scan.nextInt();
		System.out.print("세번째정수 입력: ");
		a3 = scan.nextInt();
		
		int f;
		f = a1>a2 ? a1 : a2;
		f = f>a3 ? f : a3;
		System.out.println("가장 큰 값은 "+ f );
		System.out.println("----------------------\n");
		
		//8 년도를 입력받아 윤년 여부를 출력 (조건: n%4=0, n%100!=0)
		System.out.println("윤년계산");
		System.out.print("년도 입력:");
		int year = scan.nextInt();
		boolean tf;
		tf = (year%4 == 0) && (year % 100 != 0) || (year%400 == 0);
		System.out.println(tf?"윤년O":"윤년X");
		System.out.println("----------------------\n");
		
		//9 상품가격과 지불액입력, 거스름돈의 갯수를 최소화하도록 거스름돈 출력
		//거스름돈 종류는 500, 100, 50, 10원 4가지
		System.out.println("최소 거스름돈 갯수");
		System.out.print("상품가격:");
		int product = scan.nextInt();
		System.out.print("지불액:");
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
		System.out.printf("500원:%d개, 100원:%d개, 50원:%d개, 10원:%d개", n500, n100,n50,n10);
		
		//10 하나의 정수를 입력받아 3의 배수이면 '3의 배수임' 아니면 '3의 배수가 아님' 출력
		
		//11 int a=2;	int rst = 2+2*3+a++;의 연산결과값 	=>	
		
		//12 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다.
		//만을 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면,
		//12개의 바구니가 필요할 것이다. (1)에 알맞은 코드를 넣으시오.
		int numOfApples = 123;			//사과의 개수
		int sizeOfBucket = 10;			//바구니 크기
		//int numOfBucket = (/* (1) */);
		int numOfBucket = numOfApples%sizeOfBucket==0 ? numOfApples/sizeOfBucket : numOfApples/sizeOfBucket+1;
		System.out.println("필요한 바구니의 수:" + numOfBucket);
		
		//13 연봉을(예 5000) 입력받아 세금 3.3을 제한 실수령액을 구하시오
		System.out.print("연봉:");
		int salary = scan.nextInt();
		System.out.println("실수령액 : " + (salary*(1-0.033)));
		
		//14 char c= 'A' 를 소문자로 연산하시오
		char cc= 'A';
		System.out.println(cc+32);
	}
}