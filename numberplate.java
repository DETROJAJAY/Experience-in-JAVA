import java.util.Random;

public class numberplate {
    public static void main(String[] args)
    {
        String al = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random rn = new Random();

        
        for(int i = 0 ; i < 3 ; i++)
        {
            int index = rn.nextInt(al.length());
            char rnchar = al.charAt(index);
            sb.append(rnchar);
        }

        String rns = sb.toString();
        int palt_number = rn.nextInt(9999);
        System.out.println("random plate number is : " + rns + "-" + palt_number);
    }
}
