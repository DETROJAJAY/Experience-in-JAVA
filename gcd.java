import java.util.*;
public class gcd {
    public static void main(String[] args)
    {
        int a,b,c,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first the number :");
        a = sc.nextInt();
        System.out.println("enter second the number :");
        b = sc.nextInt();
        x = 0;
        if(a > 0 && b > 0)
        {
            for (c = 1 ; c <= a || c <= b ; c ++)
        {
            if (a%c == 0 && b%c == 0)
            {
                x = c;
            }
        }
        System.out.println(x);
        }
        else
        {
            System.out.println("negetive number invalid");
        }
        
    }
}
