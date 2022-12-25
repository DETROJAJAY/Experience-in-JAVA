import java.util.*;

public class facto 
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        a = sc.nextInt();
        c = Math.abs(a);
        for(b = 1; b <= c ; b++)
        {
            if(c%b == 0)
            
            {
                if(a > 0)
                {
                    System.out.println(b);
                }
                else
                {
                    System.out.println(-b);
                }
                
            }
        }
    }
}
