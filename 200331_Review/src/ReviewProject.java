import java.util.Scanner;

public class ReviewProject {
	//1번 함수
	public static String isObes (int h, int w) {
		double st = (h-100)*0.85;
		double res = w/st*100;
		if (res<=90) return "저체중";
		else if(res>90 && res<=110) return "정상";
		else if (res>110 && res<=120) return "과체중";
		else return "비만";
	}
	
	//2번 함수
	public static void getAve() {
		Scanner scan = new Scanner(System.in);
		
		int n;
		int i=0;
		int sum=0;
		while(true) {
			System.out.print("정수 입력(종료:0):");
			n = scan.nextInt();
			if (n==0) break;
			else {
				sum += n;
				i++;
			}
		}
		System.out.println("입력정수의 개수는 "+ i + "개 이며\n평균은 "+ sum/i +"입니다.");
		
	}
	
	//3번 함수
	public static void starShow(int num) {
		for (int a=0;a<num;a++) {
			for (int k=1;k<num-a;k++) {
				System.out.print(" ");
			}
			for(int b=0;b<=a;b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//4번 함수
	public static String getMeas(int a) {
		String res="";
		for (int nn=1;nn<=a;nn++) {
			if((a%nn)==0) res = res + nn +" ";
		}
		return res;
	}
	
	//5번 함수
	public static void mulTable() {
		for(int i=1;i<=9;i+=3) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+"x"+j+"="+i*j+"\t"+(i+1)+"x"+j+"="+(i+1)*j+
						"\t"+(i+2)+"x"+j+"="+(i+2)*j);
			}
			System.out.println();
		}
	}
	
	//6번 함수
	public static String getDecimal(int a) {
		int cnt=0;
		String res="";
		for (int i=2; i<=a;i++) {
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
					cnt++;
				}
			}
			if(cnt == 1) {
				res = res + i + " ";
				cnt = 0;
			}
			else cnt = 0;
		}
		return res;
	}
	
	//7번 함수
	public static int getSum(int a, int b, int c, int d, int e) {
		int sum = 0;
		int [] arr = {a, b, c, d, e};
		for (int n:arr) {
			if(n>=0) sum += n;
		}
		return sum;
	}

	public static void main(String[] args) {
		//1번 키 몸무게 입력, 비만도계산하고 결과 반환하는 함수
		Scanner s = new Scanner(System.in);
		System.out.print("키:");
		int h = s.nextInt();
		System.out.print("몸무게:");
		int w = s.nextInt();
		System.out.println(isObes(h, w));
		
		//2번 while문으로 정수 입력받고 0입력시 입력종료. 입력한 정수의 갯수와 평균 출력.
		System.out.println("\n-----정수의 갯수와 평균 출력-----");
		getAve();
		
		//3번 정수를 입력받아 다음과 같이 출력하는 함수를 만드시오.
		//예: 4 입력시
		//   *
		// * * *
		//* * * *
		System.out.println("\n-----별 피라미드 출력-----");
		System.out.print("정수 입력:");
		int num0 = s.nextInt();
		starShow(num0);
		
		//4번 하나의 정수를 입력받아 입력한 정수의 약수를 출력하는 함수
		System.out.println("\n-----약수 구하기-----");
		System.out.print("약수를 구할 정수:");
		int num2 = s.nextInt();
		System.out.println(getMeas(num2));
		
		//5번 구구단 출력 예시
		//1x1=1	 2x1=2	3x1=3
		//...
		//1x9=9	 2x9=18	3x9=27
		//4x1=4	 5x1=5	6x1=6
		//...
		//4x9=36 5x9=45 6x9=54
		//...
		System.out.println("\n-----구구단 출력-----");
		mulTable();
		
		//6번 하나의 정수입력, 소수 출력 함수
		System.out.println("\n-----소수 출력-----");
		System.out.print("소수 구할 정수:");
		int num3 = s.nextInt();
		System.out.println("0~입력한 정수 사이의 소수 : " + getDecimal(num3));
		
		//7번 5개의 정수 입력. 양수 합을 구하여 출력하는 함수
		System.out.println("\n-----양수의 합-----");
		System.out.print("정수1:");
		int sn1=s.nextInt();
		System.out.print("정수2:");
		int sn2=s.nextInt();
		System.out.print("정수3:");
		int sn3=s.nextInt();
		System.out.print("정수4:");
		int sn4=s.nextInt();
		System.out.print("정수5:");
		int sn5=s.nextInt();
		System.out.println("양수의 합:"+getSum(sn1, sn2, sn3, sn4, sn5));
	}
}