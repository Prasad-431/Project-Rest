package programs;

public class Armstrong {
	public static void main(String args[])
	{
		int num=370;
		// sum of cubes of the digits of a number should equal to itself
		
		int rem,sum=0;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
				
		}
		
		if(sum==temp)
			System.out.println(temp +" is armstrong");
		else
			System.out.println(temp +" is not armstrong");
		
	}

}
