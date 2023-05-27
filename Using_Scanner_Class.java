package Logical_Examples;

import java.util.Scanner;

public class Using_Scanner_Class {

	public static void main(String[] args) {
		String S1=" ";
		System.out.println("Enter a value String :");
		
		Scanner sn=new Scanner(System.in);
		String srt=sn.nextLine();
		char ch[]=srt.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			
		S1+=ch[i];
		}
		
		System.out.println("Rivers String :"+S1);
		
		
		
	}

	
	}


