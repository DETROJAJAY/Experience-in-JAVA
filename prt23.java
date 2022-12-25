import java.util.Scanner;

public class prt23 {
    public static void main(String[] args)
    {
        int a[][] = new int[3][3];
        int min = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements");
        for (int i = 0 ; i < 3 ; i++)
        {
            for(int j = 0 ; j < 3 ; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        min = a[0][0];
        for(int i = 0 ; i < 3 ; i++)
        {
            for(int j=0;j<3;j++)
            {
                if (a[i][j] < min )
                {
                    min = a[i][j];
                }
            }
        }
        System.out.println("minimum number is : "+ min);
    }
}
