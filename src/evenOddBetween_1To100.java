public class evenOddBetween_1To100 {
    public static void main(String[] args) {
        //int n;
        for (int i=1;i<=100;i++) {
            if (i % 2 == 0) {
                System.out.println("Even number: " +i);
            }
        }
            for (int j=1;j<=100;j++) {
                if (j % 2 != 0) {
                    System.out.println("Odd Number: "+j);
                }
            }

    }
}
