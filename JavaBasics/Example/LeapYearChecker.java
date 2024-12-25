//Question : Input a year and find whether it is a leap year or not.

package JavaBasics.Example;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year=sc.nextInt();
        if(year % 4 == 0 ){
            if(year % 100 != 0 || year % 400 == 0){
                System.out.println(year +" is a leap year.");
            }
            else {
                System.out.println(year +" is not a leap year.");
            }
        }
        else{
            System.out.println(year +" is not a leap year.");
        }
    }
}