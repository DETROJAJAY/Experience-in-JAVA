import java.util.Scanner;

public class decimal 
{
    public static void main(String[] args)
    {
        float a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        a = sc.nextFloat();
        System.out.println("enter second value");
        b = sc.nextFloat();
        a = Math.round(a*1000);
        
        b = Math.round(b*1000);
        
        if (a == b)
        {
            System.out.println("number is same");
        }
        else   
        {
            System.out.println("number is not same");
        }
    }
}
