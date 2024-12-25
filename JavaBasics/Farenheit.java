package JavaBasics;

import java.util.Scanner;

public class Farenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temperature in Farenheit : ");
        float Farenheit=sc.nextInt();
        float Celcius=(Farenheit-32)*5/9;
        System.out.println("The Celcius value of the Farenheit is : "+Celcius);
    }
}
