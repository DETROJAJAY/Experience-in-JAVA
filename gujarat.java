import java.util.Random;

public class gujarat {
    public static void main(String[] args)
    {
        String al = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random rn = new Random();

        int ln = 2;
        for(int i = 0 ; i < 2 ; i++)
        {
            int index = rn.nextInt(al.length());
            char rnchar = al.charAt(index);
            sb.append(rnchar);
        }
        
        String rns = sb.toString();
        int plate_number = rn.nextInt(37);

        String rns2 = sb.toString();
        int palte_number2 = rn.nextInt(9999);
        System.out.println("random plate number is : GJ" + plate_number + "-" + sb + palte_number2);
    }
}
