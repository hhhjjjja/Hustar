package MatrixCalc;
import java.util.Scanner;

public class MatrixCalc {
	//��� ����
	public static int[][] sum(int[][] arr1, int[][] arr2) {
		int[][] res = new int[arr1.length][arr1[0].length];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				res[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		return res;
	}
	
	//��� ����
	public static int[][] sub(int[][] arr1, int[][] arr2) {
		int[][] res = new int[arr1.length][arr1[0].length];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				res[i][j] = arr1[i][j] - arr2[i][j];
			}
		}
		return res;
	}
	
	//��� ����
	public static int[][] mul(int[][] arr1, int[][] arr2) {
		int[][] res = new int[arr1.length][arr2[0].length];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				for(int a=0;a<arr1[0].length;a++) {
					res[i][j] += arr1[i][a] * arr2[a][j];
				}
			}
		}
		return res;
	}
	
	//��� ���
	public static void printm(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int row, col, r, c;		//row��, col�� ũ��
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���1 ��(row) : ");
		row = Integer.parseInt(scan.nextLine());
		
		System.out.print("���1 ��(col) : ");
		col = Integer.parseInt(scan.nextLine());
		
		int[][] matrix = new int[row][col];		//�Է¹��� ũ��� ���1 ����
		
		//��� ���ڰ� 1-10�� ���� ����
		for(int i=0; i<matrix.length ; i++) {
			for(int j=0; j<matrix[i].length ;j++) {
				matrix[i][j]=(int)(Math.random()*10+1);
			}
		}
		
		System.out.println();
		System.out.print("���2 ��(row) : ");
		r = Integer.parseInt(scan.nextLine());
		
		System.out.print("���2 ��(col) : ");
		c = Integer.parseInt(scan.nextLine());
		
		int[][] matrix2 = new int[r][c];
		
		//���2 ���ڰ� 1-10�� ���� ����
		for(int i=0; i<matrix2.length ; i++) {
			for(int j=0; j<matrix2[i].length ;j++) {
				matrix2[i][j]=(int)(Math.random()*10+1);
			}
		}
		
		//��� ���
		System.out.println("\n���1");
		printm(matrix);
		System.out.println();
		
		System.out.println("���2");
		printm(matrix2);
		System.out.println();
		
		//����, ����
		if(row==r && col==c) {
			System.out.println("���1 + ���2");
			printm(sum(matrix, matrix2));
			System.out.println("\n���1 - ���2");
			printm(sub(matrix, matrix2));
		} else {
			System.out.println("���� �Ұ�");
			System.out.println("���� �Ұ�");
		}
		
		//����
		if(col==r) {
			System.out.println("\n���1 * ���2");
			printm(mul(matrix, matrix2));
		}
		else {
			System.out.println("\n���� �Ұ�");
		}
	}
}