import java.util.Random;

public class randomobject {
    public static void main(String[] args)
    {
        Random rn = new Random(1000);
        for (int i = 0 ; i < 100 ; i++)
        {
            System.out.format("%5d",rn.nextInt(49));
            if ((i+1) == 0)
            {
                System.out.println();
            }
        }
    }
}
