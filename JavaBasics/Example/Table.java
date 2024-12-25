//Question : Take a number as input and print the multiplication table for it.

package JavaBasics.Example;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 20 ; i++) {
            int result=n*i;
            System.out.println(n +"x" +i +"=" +result);
        }
    }
}

