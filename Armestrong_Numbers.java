package Logical_Examples;

import java.util.Scanner;

public class Armestrong_Numbers {

	public static void main(String[] args) {
		//int a=153;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		int num=a;
		int r=0;
		int sum=0;
		
		while(a>0) {
			r=a%10;
			a=a/10;
			sum=sum+r*r*r;
		}
		if (sum==num) {
			System.out.println(sum+" : this is armstrong number");
		}else
		{
			System.out.println(sum+" : this is not armstrong number");
		}

	}

}
