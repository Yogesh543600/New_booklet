import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a= sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b= sc.nextInt();
        int c=a+b;
        System.out.println("Sum of two Number is: "+c);
    }
}
