package JavaBasics;

import java.util.Scanner;

public class PrimeIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number=sc.nextInt();
        if(number<=1){
            System.out.println("Neither Prime nor Composite");
            return;
        }
        int p=2;
        while(p * p <= number){
            if(number % p == 0){
                System.out.println("Not a Prime Number");
                return;
            }
            p+=1;
        }
        if(p * p >= number){
            System.out.println("Prime Number");
        }
    }
}
