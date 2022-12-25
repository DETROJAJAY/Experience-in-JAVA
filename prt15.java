import java.util.Scanner;
public class prt15 {
    public static void main(String[] args)
    {
        Integer decimal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter binary");
        String s = sc.nextLine();
        
        for (int i = 0 ; i < s.length() ; i++)
        {
            if(s.charAt(i) == '0' || s.charAt(i) == '1')
            {
                decimal = decimal + (((int)s.charAt(i)) - '0') * (int)(Math.pow(2,(s.length()-1)-i));
            }
            else
            {
                System.out.print("wrong binary : ");
                decimal = Integer.parseInt(s);
            }
        }
        System.out.println(decimal);
        
    }
}
