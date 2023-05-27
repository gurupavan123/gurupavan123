package Logical_Examples;

import java.util.Scanner;

public class Even_OddNumbers {

	public static void main(String[] args) {

		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter a number :");
		
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num+"Is a Even number");
			
		}
		else {
			System.out.println(num+"is a odd number");
		}
		
		
	}

}
