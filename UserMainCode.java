package stringassignment;

import java.util.Scanner;

public class UserMainCode {
	public static String getAlternateChars(String s)
	{
		String s1=s.replaceAll(" ", "");//to avoid space while incrementing .
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i=i+2)//incrementing i to alternate character
		{
		sb.append(s.charAt(i));//forming the alternate character string
		}
		String str=sb.toString();//converting character type to string
		return str;
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the String");
    String s=scanner.nextLine();
   
    System.out.println("The alternate character formed string is:"+getAlternateChars(s));
	}

}



