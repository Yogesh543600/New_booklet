import java.util.Scanner;

public class marks_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter S1 Marks: ");
        int S1= sc.nextInt();
        System.out.println("Enter S1 Marks: ");

        int S2=sc.nextInt();
        System.out.println("Enter S2 Marks: ");

        int S3=sc.nextInt();
        System.out.println("Enter S3 Marks: ");

        int S4=sc.nextInt();
        System.out.println("Enter S4 Marks: ");

        int S5=sc.nextInt();
        System.out.println("Enter S5 Marks: ");

        float Total_marks=S1+S2+S3+S4+S5;
        System.out.println("Tolat marks is: "+Total_marks);
        double average_marks= Total_marks/5;
        System.out.println("Average marks is: "+average_marks);
        double percentage=(Total_marks/500)*100;
        System.out.println("Percentage is: "+percentage);

    }
}
