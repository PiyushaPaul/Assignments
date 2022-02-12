package assignment2;

import java.util.Scanner;

public class AddMatrices {

	public static void main(String[] args) {
		
		int m,n;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of rows less than 10");
		m=sc.nextInt();
		System.out.println("Enter the number of columns less than 10");
		n=sc.nextInt();
		int arr[][]=new int[m][n];
		int arr2[][]=new int[m][n];
		int sum[][]=new int[m][n];
		
		System.out.println("Enter the elements of the array1");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the elements of the array2");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		
		sc.close();
		
		System.out.println("The sum of two matrices is: ");
		for (int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				
				sum[i][j]=arr[i][j]+arr2[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		}

	}


