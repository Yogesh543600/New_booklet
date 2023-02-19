import java.util.Scanner;

public class compund_Interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int P,T;
        double compound_Interest;
        System.out.println("Entre Principle Amount: ");
        P=sc.nextInt();
        System.out.println("Entre Time in Year: ");
        T=sc.nextInt();
        System.out.println("Entre rate of interest: ");
       float R=sc.nextInt();
        compound_Interest=P*(Math.pow((1+R/100),T))-P;
        System.out.println("Compound Interest is: "+compound_Interest);
    }

}
