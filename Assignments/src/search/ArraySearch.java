package search;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		
		int arr1[]=new int[10];
		int f;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=input.nextInt();
		}
		System.out.println("*************************************");
		System.out.println("Enter elements to be searched");
		f=input.nextInt();
		input.close();
		
		for(int i=0;i<arr1.length;i++) {
			
			if(arr1[i]==f) {
				System.out.println(" The number is "+ arr1[i]+" is found at index position "+ i);
			}
			
		}

	}

}
