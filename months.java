import java.util.Scanner;

public class months
{
    public static void main(String[] args)
    {
        int a,b;
        String month,days;
        Scanner sc = new Scanner(System.in);
        System.out.println("input the number of month:");
        a = sc.nextInt();
        month = sc.nextLine();
        System.out.println("input the number of year:");
        b = sc.nextInt();
        days = sc.nextLine();
        
        
        
        switch(a)
        {   
            case 1:
            month = "january";
            days = "31";
            break;

            case 2:
            month = "february";
            if (b%4 == 0)
                days = "29";
            else
                days = "28";
            break;

            case 3:
            month = "march";
            days = "31";
            break;

            case 4:
            month = "april";
            days = "30";
            break;

            case 5:
            month = "may";
            days = "31";
            break;

            case 6:
            month = "june";
            days = "30";
            break;

            case 7:
            month = "july";
            days = "31";
            break;

            case 8:
            month = "august";
            days = "31";
            break;

            case 9:
            month = "september";
            days = "30";
            break;

            case 10:
            month = "october";
            days = "31";
            break;

            case 11:
            month = "november";
            days = "30";
            break;

            case 12:
            month = "december";
            days = "31";
            break;
        }
        System.out.println(month+" "+ b + " has " + days + " days");
    }
}
