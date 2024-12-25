package JavaBasics;

import java.util.Scanner;

public class PrimeII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number=sc.nextInt();
        if(isPrime(number)){
            System.out.println(number+" is a Prime Number");
        }
        else{
            System.out.println(number+" is not a Prime Number");
        }
    }

    public static boolean isPrime(int number) {
        if(number<1){
            return false;
        }
        else{
            for (int i = 2; i < number; i++) {
                if(number%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}
