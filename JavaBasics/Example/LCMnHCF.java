//Question : Take 2 numbers as inputs and find their HCF and LCM.

package JavaBasics.Example;

import java.util.Scanner;

public class LCMnHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();

        //calculate hcf using Euclidean algorithm

        int a=num1;
        int b=num2;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        int HCF = a;

        //calculate lcm using the formulae => (num1*num2)/hcf
        int LCM=(num1 * num2)/HCF;

        System.out.println("HCF or GCD of "+num1 +" and " +num2 +" is " +HCF);
        System.out.println("LCM of "+num1 +" and " +num2 +" is " +LCM);
    }
}
