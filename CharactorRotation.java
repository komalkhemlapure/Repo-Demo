package string;

public class Demo8 //character rotation
{

	public static void main(String[] args) {
		System.out.println("PS");
		String str="Love";
		char arr[]=str.toCharArray();
		
		for(int i=0;i<=arr.length-1;i++)
		{
			int index=i;
			for(int j=0;j<=arr.length-1;j++)
			{
				System.out.print(arr[index]);
				index++;
				index=index%4;
			}
			System.out.println();
		}
		System.out.println("PE");

	}

}
