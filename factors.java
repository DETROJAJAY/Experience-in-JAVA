import java.util.Scanner;
public class factors {
    public static void main(String[] args)
    {
        int a,b,c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        a = sc.nextInt();
        c = Math.abs(a);

        for(b = 2; b <= c ; b++)
        {
            if(c%b == 0)
            {
                c = c / b;
                
                if(a > 0)
                {
                    System.out.println(b);
                }
                else
                {
                    System.out.println(-b);
                }
                b = 1;
            }
            
        }
    }
}
