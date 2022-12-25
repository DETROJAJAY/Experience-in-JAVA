import java.util.Scanner;
public class sum
{
    public static void main(String[] args)
    {
        int a,b,c,d,e,sum,avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number");
        a  = sc.nextInt();
        System.out.println("enter the 2nd number");
        b  = sc.nextInt();
        System.out.println("enter the 3rd number");
        c  = sc.nextInt();
        System.out.println("enter the 4th number");
        d  = sc.nextInt();
        System.out.println("enter the 5th number");
        e  = sc.nextInt();

        sum = a+b+c+d+e;
        System.out.println("sum = " + sum);
        avg = sum/5;
        System.out.println("avrege = " + avg);
    }
}