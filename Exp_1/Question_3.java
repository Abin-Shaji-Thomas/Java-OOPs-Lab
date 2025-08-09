import java.util.*;
class Third
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Distance in Kilometer");
		int kil=sc.nextInt();
		System.out.println(kil +" Kilometer in meter is " + (kil*1000));
		System.out.println(kil +" Kilometer in centimeter is "+(kil*100000));
		System.out.println(kil +" Kilometer in millimeter is " +(kil*1000000));
}
}