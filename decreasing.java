import java.util.Scanner;

public class decreasing
{
    public static void main(String[] args) 
    {
        sort_array obj = new sort_array();
        int array[] = obj.fuc2();
        int i;
        for (i = 0 ; i < (array.length); i++)
        {
            System.out.println(""+i+" element of array is : " + array[i]);
        }
    }
}

class sort_array
{
    int i,j,z,x;
    int array[];
    public int [] fuc2()
    {
        x = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the total number of element want to enter in array : ");
        j = sc.nextInt();
        array = new int[j];
        for (i = 0 ; i < j ; i++)
            {
                System.out.println("enter number into array for location "+i+" : ");
                array[i] = sc.nextInt();
            }
        do
        {
            for(i = 0 ; i < (j - 1) ; i++)
            {
                if (array[i] < array[i + 1])
                {
                    z = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = z;
                }
            }
            x++;
        }
    
        while ( x < j);
            
        return array ;
    }
        
}