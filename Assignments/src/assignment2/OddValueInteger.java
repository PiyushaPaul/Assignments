package assignment2;

import java.util.Scanner;

public class OddValueInteger {

	public static void main(String[] args) {
		
		
		int m,n;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of rows less than 10");
		m=sc.nextInt();
		System.out.println("Enter the number of columns less than 10");
		n=sc.nextInt();
		int arr[][]=new int[m][n];
		
		System.out.println("Enter the elements of the array");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		sc.close();
		
		System.out.println("The odd integers in the given 2D array are: ");
		for (int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
			if(arr[i][j]%2!=0) {
				System.out.println(arr[i][j]);
			}
		}
		}
	}

}
