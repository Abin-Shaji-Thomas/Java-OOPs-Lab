import java.util.*;
class Question_1
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first subject mark ");
		float mark1=sc.nextFloat();
		System.out.print("Enter second subject mark");
		float mark2=sc.nextFloat();
		System.out.print("Enter third subject mark");
		float mark3=sc.nextFloat();
		System.out.print("Enter fourth subject mark");
		float mark4=sc.nextFloat();
		System.out.print("Enter fifth subject mark");
		float mark5=sc.nextFloat();
		System.out.println("Your total mark is "+ (mark1+mark2+mark3+mark4+mark5));
		System.out.println("Your average is " + (mark1+mark2+mark3+mark4+mark5)/5);
		System.out.println("Your Percentage is " + ((mark1+mark2+mark3+mark4+mark5)/500)*100);

	}
}
