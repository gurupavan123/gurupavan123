package Logical_Examples;

public class Reverse_String {

	public static void main(String[] args) {
		
		String sn=new String();
		sn=sn.concat("gurupavan");
		System.out.println(sn);
		String rev="";
		for(int i=sn.length()-1;i>=0;i--) {
			rev=rev+sn.charAt(i);
			
		}
		System.out.println(rev);
	}

}
