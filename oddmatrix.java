import java.util.*;

public class oddmatrix {
    public static void main(String[] args)
    {
        int count = 0,j,i,count1 = 0;
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for(i = 0 ; i < 3 ; i++)
        {
            for( j = 0 ; j < 3 ; j++)
            {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] != 0 && matrix[i][j] != 1)
                {
                    System.out.println("error, plz enter that element again");
                    j = j - 1;
                }
            }
            
        }

        for(i = 0 ; i < 3 ; i++)
        {
            for (j = 0 ; j < 3 ; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

        for(i = 0 ; i < 3 ; i++)
        {
            for (j = 0 ; j < 3 ; j++)
            {
                if(matrix[i][j] == 1)
                {
                    count = count + 1;
                }
                if(matrix[j][i] == 1)
                {
                    count1 = count1 + 1;
                }
            }
        
            if(count % 2 == 0)
            {
                System.out.println(i + "row is even");
            }
            else
            {
                System.out.println(i + "row is odd");
            }
            if(count1%2 == 0)
            {
                System.out.println( i + "coloumn is even");
            }
            else
            {
                System.out.println(i + " column is odd");
            }
            count = 0;
            count1 = 0;
        }
    }
}
