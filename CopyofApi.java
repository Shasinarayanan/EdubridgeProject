package arrayapi;

import java.util.Arrays;

public class CopyofApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] org=new int[] {1,2,3};
    System.out.println("original array");
    for(int i=0;i<org.length;i++)
    {
    	System.out.print(org[i]+" ");
    	
     }
    System.out.println();
	
    int[] copy=Arrays.copyOf(org, 5);//Arrays.copyOf(original,length);
    copy[3]=11;
    copy[4]=55;
    System.out.println("New array copy:");
    for(int i=0;i<copy.length;i++)
    {
    	System.out.print(copy[i]+" ");
    	
    }
	}

}
