import java.util.Scanner;

public class ReviewProject {
	//1�� �Լ�
	public static String isObes (int h, int w) {
		double st = (h-100)*0.85;
		double res = w/st*100;
		if (res<=90) return "��ü��";
		else if(res>90 && res<=110) return "����";
		else if (res>110 && res<=120) return "��ü��";
		else return "��";
	}
	
	//2�� �Լ�
	public static void getAve() {
		Scanner scan = new Scanner(System.in);
		
		int n;
		int i=0;
		int sum=0;
		while(true) {
			System.out.print("���� �Է�(����:0):");
			n = scan.nextInt();
			if (n==0) break;
			else {
				sum += n;
				i++;
			}
		}
		System.out.println("�Է������� ������ "+ i + "�� �̸�\n����� "+ sum/i +"�Դϴ�.");
		
	}
	
	//3�� �Լ�
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
	
	//4�� �Լ�
	public static String getMeas(int a) {
		String res="";
		for (int nn=1;nn<=a;nn++) {
			if((a%nn)==0) res = res + nn +" ";
		}
		return res;
	}
	
	//5�� �Լ�
	public static void mulTable() {
		for(int i=1;i<=9;i+=3) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+"x"+j+"="+i*j+"\t"+(i+1)+"x"+j+"="+(i+1)*j+
						"\t"+(i+2)+"x"+j+"="+(i+2)*j);
			}
			System.out.println();
		}
	}
	
	//6�� �Լ�
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
	
	//7�� �Լ�
	public static int getSum(int a, int b, int c, int d, int e) {
		int sum = 0;
		int [] arr = {a, b, c, d, e};
		for (int n:arr) {
			if(n>=0) sum += n;
		}
		return sum;
	}

	public static void main(String[] args) {
		//1�� Ű ������ �Է�, �񸸵�����ϰ� ��� ��ȯ�ϴ� �Լ�
		Scanner s = new Scanner(System.in);
		System.out.print("Ű:");
		int h = s.nextInt();
		System.out.print("������:");
		int w = s.nextInt();
		System.out.println(isObes(h, w));
		
		//2�� while������ ���� �Է¹ް� 0�Է½� �Է�����. �Է��� ������ ������ ��� ���.
		System.out.println("\n-----������ ������ ��� ���-----");
		getAve();
		
		//3�� ������ �Է¹޾� ������ ���� ����ϴ� �Լ��� ����ÿ�.
		//��: 4 �Է½�
		//   *
		// * * *
		//* * * *
		System.out.println("\n-----�� �Ƕ�̵� ���-----");
		System.out.print("���� �Է�:");
		int num0 = s.nextInt();
		starShow(num0);
		
		//4�� �ϳ��� ������ �Է¹޾� �Է��� ������ ����� ����ϴ� �Լ�
		System.out.println("\n-----��� ���ϱ�-----");
		System.out.print("����� ���� ����:");
		int num2 = s.nextInt();
		System.out.println(getMeas(num2));
		
		//5�� ������ ��� ����
		//1x1=1	 2x1=2	3x1=3
		//...
		//1x9=9	 2x9=18	3x9=27
		//4x1=4	 5x1=5	6x1=6
		//...
		//4x9=36 5x9=45 6x9=54
		//...
		System.out.println("\n-----������ ���-----");
		mulTable();
		
		//6�� �ϳ��� �����Է�, �Ҽ� ��� �Լ�
		System.out.println("\n-----�Ҽ� ���-----");
		System.out.print("�Ҽ� ���� ����:");
		int num3 = s.nextInt();
		System.out.println("0~�Է��� ���� ������ �Ҽ� : " + getDecimal(num3));
		
		//7�� 5���� ���� �Է�. ��� ���� ���Ͽ� ����ϴ� �Լ�
		System.out.println("\n-----����� ��-----");
		System.out.print("����1:");
		int sn1=s.nextInt();
		System.out.print("����2:");
		int sn2=s.nextInt();
		System.out.print("����3:");
		int sn3=s.nextInt();
		System.out.print("����4:");
		int sn4=s.nextInt();
		System.out.print("����5:");
		int sn5=s.nextInt();
		System.out.println("����� ��:"+getSum(sn1, sn2, sn3, sn4, sn5));
	}
}