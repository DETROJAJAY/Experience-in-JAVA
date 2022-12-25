import java.util.Scanner;

public class area
{
	public static void main(String[] args)
	{
		double pi = 3.14,a,A;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("enter the value of redius");
		a = sc.nextDouble();

		A = pi * a*a;
		System.out.println("area is" + A);
	}
}