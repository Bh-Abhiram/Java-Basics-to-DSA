package JavaBasics;

import java.util.Scanner;

public class PrimeI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number=sc.nextInt();

        boolean isPrime=true;
        if(number<=1){
            isPrime=false;
            System.out.println("Not a Prime Number because it is less than or equal to 1");
        }
        else{
            for(int i=2;i<number;i++){
                if(number%i==0){   //divide the number with all numbers other than 1 and itself
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(number+" is a Prime Number");
        }
        else{
            System.out.println(number+" is Not a Prime Number");
        }
    }
}
