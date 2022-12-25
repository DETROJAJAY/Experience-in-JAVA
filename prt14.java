import java.util.Date;
import java.text.SimpleDateFormat;
import javax.xml.crypto.Data;

public class prt14 {
    public static void main(String[] args)
    {
        String z [] = new String[12];
        
        loan l = new loan(15);
        z[0] = l.display();
        circle c = new circle(3);
        z[1] = c.display();
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        z[2] = sdf.format(d);
        String s = new String("jay");
        z[3] = s;

        for (int i  = 0 ; i < 4 ; i++)
        {
            System.out.println(z[i]);
        }
    }
}

class loan
{
    int a,interest ;
    loan(int a)
    {
        interest = a;
    }
    String display()
    {
        return ("interest per year = " + interest + "%");
    }
}

class circle
{
    int a;
    double redius, b = 3.14;
    circle(int a)
    {
        redius = a * a * b;
    }
    String display()
    {
        return ("redius = " + redius);
    }
}


