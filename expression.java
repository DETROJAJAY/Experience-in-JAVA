import java.util.*;
import java.util.Scanner;
public class expression 
{
    public static void main(String[] args)
    {
        String a;
        int c,x = 0;
        int y = 10;
        System.out.println("input the string expression");
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        char [] ca = a.toCharArray();
        
        for (c = 0 ; c < a.length() ; c++)
        {
            if ( ca[c]  == ' ')
            {
                continue;
            }
            else if( ca[c] == '1' || ca[c] == '2' || ca[c] == '3' || ca[c] == '4' || ca[c] == '5' || ca[c] == '6' ||ca[c] == '7' || ca[c] == '8' || ca[c] == '9' || ca[c] == '0' )
            {
                x = (int)(ca[c] - '0');
                if (y == 10)
                {
                    y = x;
                }    
            }
        }
        for (c = 0 ; c < a.length() ; c++)
        {
            switch (ca[c])
            {
                case '+':
                    System.out.println(y + x);
                    break;
                case '-':
                    System.out.println(y - x);
                    break;
                case '*':
                    System.out.println(y * x);
                    break;
                case '/':
                    System.out.println(y / x);
                    break;
            }
        }
    }
}
