import java.util.Scanner;
import java.lang.*;
public class check_vowel {
    public static void main(String[] args)
    {
        char j;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter te strings : "); 
        j = sc.next().charAt(0);
        j = java.lang.Character.toUpperCase(j);
        
        if(j == 'A' || j == 'E' || j == 'I' || j== 'O' || j == 'U')
        {
            System.out.println("Charecter is a wovel");
        }
        else
        {
            System.out.println("Charecter is not a wovel");
        }
    }
}
