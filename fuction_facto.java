import java.util.Scanner;
public class fuction_facto {
    public static void main(String[] args)
    {
        int a,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        a = sc.nextInt();
        c = Math.abs(a);
        fuction(c);

    }

    public static void fuction(int b)
    {
        int i;
        for(i = 1; i <= b ; i++)
        {
            if(b%i == 0)
            {
                if(b > 0)
                {
                    System.out.println(i);
                }
                else
                {
                    System.out.println(-i);
                }
                
            }
        }
    }
}


