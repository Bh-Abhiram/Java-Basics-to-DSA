//Question : Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

package JavaBasics.Example;

import java.util.Scanner;

public class SumOfNumbersTillX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the numbers to add or type 'x' to finish.");
        while(true){
            String input=sc.next();

            if(input.equals("x")){
                break;
            }
            int number=Integer.parseInt(input);
            sum+=number;
        }
        System.out.println("The sum of the all entered numbers is: "+sum);
    }

}
