import java.util.Scanner;

public class large 
{
    public static void main(String[] args)
    {
        float a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        a = sc.nextFloat();
        if ( a > 0)
        {
            System.out.println("number is positive");
        }
        else if (a < 0)
        {
            System.out.println("number is negaative");
        }
        else 
        {
            System.out.println("number is zero");
        }
        if (a > 1000000)
        {
            System.out.println("number is larger");
        }
        else 
        {
            System.out.println("number is smaller");
        }
    }
}
