import java.util.Scanner;

public class week {
    public static void main(String[] args)
    {
        String day;
        int week;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of day");
        week = sc.nextInt();
        day = sc.nextLine();
        switch(week)
        {
            case 1:
                day = "monday";
                break;
            case 2:
                day = "tuesday";
                break;
            case 3:
                day = "wednsday";
                break;
            case 4:
                day = "thuesday";
                break;
            case 5:
                day = "friday";
                break;
            case 6:
                day = "saturday";
                break;
            case 7:
                day = "sunday";
                break;
        }
        System.out.println("Day is: " + day);

    }
    
}
