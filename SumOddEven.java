package sixteenthmarchtwo;

public class SumOddEven {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evensum=0;
		int oddsum=0;
	
		for(int num=0;num<=16;num++)
		{
			if(num%2==0)
			{
				
				evensum+=num;
			   
			}
			     
			else
			{ 
				
				oddsum+=num;
				
			}
            
	}
		System.out.println("evensum:"+evensum+"oddsum:"+oddsum);

}
}
