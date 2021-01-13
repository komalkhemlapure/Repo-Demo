package prog;

public class Prog16 {

	public static void main(String[] args) {
		System.out.println("PS");
		for(int i=1;i<=500;i++)
		{
			int num=i;
			int sum=0;
			for(int j=1;j<num;j++)
			{
				if(num%j==0)
				{
					sum=sum+j;
				}
			}	
			if(num==sum)
			{
				System.out.println(num+" is perfect no");
			}
		}
			
	}

}
