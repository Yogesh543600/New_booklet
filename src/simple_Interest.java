import java.util.Scanner;

public class simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P,T,R;
        int si;
        System.out.println("Enter Principle Amount: ");
        P=sc.nextInt();
        System.out.println("Enter Time: ");
        T=sc.nextInt();
        System.out.println("Entre rate of interest: ");
        R= sc.nextInt();
        si=P*T*R/100;
        System.out.println("Simple Interest is: "+si);
    }
}
