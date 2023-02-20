import java.util.Scanner;

public class gross_Salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Basic Salary: ");
        int Basic_Salary= sc.nextInt();
        double Gross_salary,HRA,DA;

        if (Basic_Salary<=10000){
            HRA =Basic_Salary*0.2;
            DA = Basic_Salary*0.8;

        } else if (Basic_Salary<=20000) {
            HRA=Basic_Salary*0.25;
            DA=Basic_Salary*0.9;

        } else  {
            HRA=Basic_Salary*0.3;
            DA=Basic_Salary*0.95;

        }
        Gross_salary=Basic_Salary+HRA+DA;
        System.out.println("Gross Salary is: "+Gross_salary);
    }
}
