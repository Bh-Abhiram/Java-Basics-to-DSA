package JavaBasics;

import java.util.Scanner;

public class Celcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temperature Value in Celcius : ");
        float Celcius=sc.nextFloat();    //nextInt will also work if you give only integer input rather than floating point
        float Farenheit=(Celcius*9/5)+32;
        System.out.println("The Farenheit value for the Celcius is : "+Farenheit);
    }
}
