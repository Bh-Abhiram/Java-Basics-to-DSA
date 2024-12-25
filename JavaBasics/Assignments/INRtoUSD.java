//Question : Input currency in rupees and output in USD.

package JavaBasics.Assignments;

import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount in Indian Rupees(INR) : ");
        double INR=sc.nextDouble();
        double Conversion=85.40;
        double USD=INR/Conversion;
        System.out.printf("The equivalent amount in USD is %.2f\n",USD);
    }
}
