package JavaBasics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b=sc.nextInt();
        //sum for a and b
        int sum=a+b;

        System.out.print("Enter the value of c : ");
        float c=sc.nextFloat();
        System.out.print("Enter the value of d : ");
        float d=sc.nextFloat();
        //result for c and d
        float result=c+d;
        System.out.println("The sum of a and b is : "+sum);
        System.out.println("The Result of c and d is : "+result);


    }
}
