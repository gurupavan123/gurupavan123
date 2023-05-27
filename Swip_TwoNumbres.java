package Logical_Examples;

import java.util.Scanner;

public class Swip_TwoNumbres {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println("Enter a number");
		int b=sc.nextInt();
		
		System.out.println("Ststing values a :  "+a+"  And b  :"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swiping values a  : "+a+"  And b  :"+b);
		

		
	}

}
