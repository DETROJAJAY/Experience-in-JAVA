import java.util.Scanner;

public class max 
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a");
        a = sc.nextInt();
        System.out.println("enter value of b");
        b = sc.nextInt();
        System.out.println("enter value of c");
        c = sc.nextInt();
        if (a > b )
        {
            if (a > c )
            {
            System.out.println("a is maximum");
            }
            else
            {
                System.out.println("c is maximum");
            }
        }
        else if (b > c)
        {
            System.out.println("b is maximum");
        }
        else 
        {
            System.out.println("c is maximum");
        }
    }
    
}
