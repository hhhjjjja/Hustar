package MatrixCalc;
import java.util.Scanner;

public class MatrixCalc {
	//Çà·Ä µ¡¼À
	public static int[][] sum(int[][] arr1, int[][] arr2) {
		int[][] res = new int[arr1.length][arr1[0].length];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				res[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		return res;
	}
	
	//Çà·Ä »¬¼À
	public static int[][] sub(int[][] arr1, int[][] arr2) {
		int[][] res = new int[arr1.length][arr1[0].length];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				res[i][j] = arr1[i][j] - arr2[i][j];
			}
		}
		return res;
	}
	
	//Çà·Ä °ö¼À
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
	
	//Çà·Ä Ãâ·Â
	public static void printm(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int row, col, r, c;		//rowÇà, col¿­ Å©±â
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Çà·Ä1 Çà(row) : ");
		row = Integer.parseInt(scan.nextLine());
		
		System.out.print("Çà·Ä1 ¿­(col) : ");
		col = Integer.parseInt(scan.nextLine());
		
		int[][] matrix = new int[row][col];		//ÀÔ·Â¹ÞÀº Å©±â·Î Çà·Ä1 »ý¼º
		
		//Çà·Ä ¼ýÀÚ°ª 1-10Áß ·£´ý ÁöÁ¤
		for(int i=0; i<matrix.length ; i++) {
			for(int j=0; j<matrix[i].length ;j++) {
				matrix[i][j]=(int)(Math.random()*10+1);
			}
		}
		
		System.out.println();
		System.out.print("Çà·Ä2 Çà(row) : ");
		r = Integer.parseInt(scan.nextLine());
		
		System.out.print("Çà·Ä2 ¿­(col) : ");
		c = Integer.parseInt(scan.nextLine());
		
		int[][] matrix2 = new int[r][c];
		
		//Çà·Ä2 ¼ýÀÚ°ª 1-10Áß ·£´ý ÁöÁ¤
		for(int i=0; i<matrix2.length ; i++) {
			for(int j=0; j<matrix2[i].length ;j++) {
				matrix2[i][j]=(int)(Math.random()*10+1);
			}
		}
		
		//Çà·Ä Ãâ·Â
		System.out.println("\nÇà·Ä1");
		printm(matrix);
		System.out.println();
		
		System.out.println("Çà·Ä2");
		printm(matrix2);
		System.out.println();
		
		//µ¡¼À, »¬¼À
		if(row==r && col==c) {
			System.out.println("Çà·Ä1 + Çà·Ä2");
			printm(sum(matrix, matrix2));
			System.out.println("\nÇà·Ä1 - Çà·Ä2");
			printm(sub(matrix, matrix2));
		} else {
			System.out.println("µ¡¼À ºÒ°¡");
			System.out.println("»¬¼À ºÒ°¡");
		}
		
		//°ö¼À
		if(col==r) {
			System.out.println("\nÇà·Ä1 * Çà·Ä2");
			printm(mul(matrix, matrix2));
		}
		else {
			System.out.println("\n°ö¼À ºÒ°¡");
		}
	}
}