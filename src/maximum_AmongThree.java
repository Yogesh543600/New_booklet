import java.util.Scanner;

public class maximum_AmongThree {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");
        n1= sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        if (n1>=n2 && n1>=n3){
            System.out.println("Maximum Number is: "+n1);
        } else if (n2>=n1 && n2>=n3) {
            System.out.println("Maximum number is: "+n2);
        }
        else {
            System.out.println("maximum number is: "+n3);
        }
    }
}
