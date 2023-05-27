package Logical_Examples;

import java.util.Scanner;

public class Number_palindrome {

	public static void main(String[] args) {
            
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int n=num;
	    int	rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;	
		}
		if(rev==n) {
		System.out.println(rev+"  :it is polindrom");
		}else {
			System.out.println(rev+" :not palindron");
		}
	}

}
