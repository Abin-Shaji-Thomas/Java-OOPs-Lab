import java.util.*;
class Second
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter you Basic salary ");
		double BS=sc.nextDouble();
		double HRA=0.20*BS;
		double DA=0.12*BS;
		System.out.println("HRA= " + HRA);
		System.out.println("DA= "+DA);
		System.out.println("Gross Salary= " +(BS+HRA+DA));
	}
}