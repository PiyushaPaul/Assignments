package assignment2;

import java.util.Scanner;

public class EvenValueInteger {

	public static void main(String[] args) {
		
		int arr[]=new int[10];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 10 integers: ");
		for(int i=0;i<10;i++) {
			
			arr[i]=sc.nextInt();
			
		}
		sc.close();
		
		System.out.println("The even integers in the given array are: ");
		for (int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}

	}

}
