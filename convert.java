import java.util.Scanner;

public class convert 
{
    public static void main (String[] args)

    {
        double c,f;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of fahrenheit");
        f = sc.nextDouble();

        c = (f - 32) * (9*f / 5);
        System.out.println("celsius is" + c);
    }
}
