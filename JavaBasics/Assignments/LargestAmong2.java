//Question : Take 2 numbers as input and print the largest number.


package JavaBasics.Assignments;

import java.util.Scanner;

public class LargestAmong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num1 : ");
        int num1=sc.nextInt();
        System.out.print("Enter the value of num2 : ");
        int num2=sc.nextInt();
        if(num1==num2){
            System.out.println("Both numbers are equal!!!");
        }
        else if(num1 > num2){
            System.out.println("The Largest number is : "+num1);
        }
        else{
            System.out.println("The Largest number is : "+num2);
        }

    }
}
