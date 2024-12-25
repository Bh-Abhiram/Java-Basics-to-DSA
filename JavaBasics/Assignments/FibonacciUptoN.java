//Question : To calculate Fibonacci Series up to n numbers.

package JavaBasics.Assignments;

import java.util.Scanner;

public class FibonacciUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int n=sc.nextInt();
        long a=0, b=1;
        System.out.print("Fibonacci series: " + a + ", " + b);
        for(int i=3;i<=n;i++){
            long next=a+b;
            System.out.print(", "+next);
            a=b;
            b=next;
        }
    }
}
