//Question : Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.


package JavaBasics.Assignments;

import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of Principle : ");
        double P=sc.nextDouble();
        System.out.print("Enter the value of Time(in years): ");
        double T=sc.nextDouble();
        System.out.print("Enter the value of Rate(in percentage) : ");
        double R=sc.nextDouble();

        //formula for SI
        double SimpleInterest=(P*T*R)/100;
        System.out.printf("The Simple Interest for given data is : %.2f\n",SimpleInterest);
    }
}
