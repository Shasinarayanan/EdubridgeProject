package stringassignment;

import java.util.Scanner;

public class UserMainCod {
	public static String encrypt(String s)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
		char c=s.charAt(i);//reading each character array
		if(i%2==0)//as the index starts from 0,change the even number index to next alphabet
		{
			if(c=='z'|| c=='Z')//if alphabet is z
			
				c=(char)(c-25);//subtracting by 25,so that z is replaced by a
			else
				c=(char)(c+1);//if not z,every other alphabet will be replaced by next alphabet
			sb.append(c);
		}
		else
			sb.append(c);//if alphabet is not in odd position,then just print it without any change
		}
		
		return sb.toString();//changing from character array to string  type
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner=new Scanner(System.in);
		    System.out.println("Enter the String");
		    String s=scanner.nextLine();//getting the string as input
		   System.out.println("The new String is:"+encrypt(s));//function call
		    		
	}

}
