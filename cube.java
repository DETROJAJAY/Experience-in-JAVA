import java.util.Scanner;
public class cube
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the integer");
        a = sc.nextInt();
        c = 0;
        b = 1;
        do{
            c = b*b;
            System.out.println("cube of " + b +" = "+ c);
            b = b + 1;}
        while (a >= b);
    }
}