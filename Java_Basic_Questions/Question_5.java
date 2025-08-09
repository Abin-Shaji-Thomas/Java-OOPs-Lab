import java.util.*;
class Fifth
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Principle amount ");
		double P=sc.nextDouble();
		System.out.print("Enter Rate of interest ");
		double R=sc.nextDouble();
		System.out.print("Enter Time ");
		int T=sc.nextInt();
		double SI=(P*R*T)/10;
		System.out.println("Simple Interest is "+SI);
	}
}