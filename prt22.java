import java.util.Scanner;
public class prt22 {
    public static void main(String[] args)
    {
        int a[] = new int[5];
        int min = 0 ,pro = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements");
        for (int i = 0 ; i < 5 ; i++)
        {
            a[i] = sc.nextInt();
        }
        
        min = a[0];
        for(int i = 0 ; i < 5 ; i++)
        {
            //for find min number
            if (a[i] < min )
            {
                min = a[i];
            }

            //for product
            pro = a[i] * pro;
        }
        System.out.println("minimum number : " + min + "\n" + "product of all element : " + pro);
    }
}
