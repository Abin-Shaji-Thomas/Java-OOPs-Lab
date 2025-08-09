import java.util.*;
public class Question_7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		int count=0;
		int i;
		for(i=0;i<10;i++)
		{
			System.out.println("Enter element at "+(i+1));
			arr[i]=sc.nextInt();
			if(arr[i]%3==0&&arr[i]%9==0)
				count++;
		}
		int multiples[]=new int[count];
		int j=0;
		for(i=0;i<10;i++)
		{
			
			if(arr[i]%3==0&&arr[i]%9==0)
			{
				multiples[j]=arr[i];
				j++;
			}
		}
		for(i=0;i<count;i++)
		{
			System.out.print(multiples[i]+" ");
		}
		
	}

}