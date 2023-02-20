import java.util.Scanner;

public class electricity_Unit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Units:  ");
        int unit=sc.nextInt();
        double amt;

        if (unit<=50){
           amt= unit*0.50;
        } else if (unit<=150){
            amt=unit*0.75;
        } else if (unit>=250) {
            amt=unit*1.20;
        }
        else {
            amt=unit*1.50;
        }
        double surcharge=amt*0.20;
        double total_amt=amt+surcharge;

        System.out.println("Total Electricity Bill ith additional Surcharge is: "+total_amt);
    }
}
