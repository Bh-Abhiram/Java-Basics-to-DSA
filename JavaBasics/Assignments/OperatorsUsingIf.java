//Question : Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package JavaBasics.Assignments;

import java.util.Scanner;

public class OperatorsUsingIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num1 : ");
        int num1=sc.nextInt();
        System.out.print("Enter the value of num2 : ");
        int num2=sc.nextInt();
        System.out.print("Enter any Operator(+, -, *, /) : ");
        char opr=sc.next().charAt(0);
        double result;
        if(opr=='+'){
            result=num1+num2;
        }
        else if(opr=='-'){
            result=num1-num2;
        }
        else if(opr=='*'){
            result=num1*num2;
        }
        else if(opr=='/'){
            if(num2!=0){
                result= (double) num1 / num2;
            }
            else{
                System.out.println("Division by Zero Error");
                return;
            }
        }
        else{
            System.out.println("Invalid Operator!!!!");
            return;
        }
        System.out.println("The Result is : "+result);
    }

}
