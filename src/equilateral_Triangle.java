import java.util.Scanner;

public class equilateral_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre value for side fo trangle");
        float a =sc.nextFloat();
        double area;
        area=(1.73*a*a)/4;
        System.out.println("Area of Equilateral Trangle is: "+area);
    }
}
