import java.util.Scanner;
public class binary_search {
    public static void main(String[] args)
    {
        int l = 0,r = 0,key,middle,i,x;
        Scanner sc = new Scanner(System.in);



        sort_array obj = new sort_array();
        int array[] = obj.fuc2();
        r = array.length - 1;
        
        
        System.out.println("enter element which want to find");
        key = sc.nextInt();

        do
        {
            middle = (l + r)/2;
            if(array[middle] == key)
            {
               System.out.println("succesed");
               System.out.println("element at "+middle+" location");
            }
            else if(array[middle] > key)
            {
                l = middle + 1;
            }
            else 
            {
                r = middle - 1;
            } 
        }
        while (array[middle] != key && r >= l);
        if (r < l)
            {
                System.out.println("unsuccesed");
            }

    }
}
