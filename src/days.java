import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Days: ");
        int d = sc.nextInt();
        int year, week, day;
        year= d/365;
        System.out.println("Year: "+year);
        week= d%365/7;
        System.out.println("Weeks: "+week);
        day= d%365%7;
        System.out.println("Days: "+day);
    }
}
