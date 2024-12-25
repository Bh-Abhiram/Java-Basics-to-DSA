//Question:Write a program to print whether a number is even or odd, also take input from the user.

package JavaBasics.Assignments;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println(number+" is an Even Number");
        }
        else{
            System.out.println(number+" is an Odd Number");
        }
    }
}
