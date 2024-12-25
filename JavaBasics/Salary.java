package JavaBasics;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the salary : ");
        int salary=sc.nextInt();
        if(salary>=10000){
            salary=salary+20000;}
        else{
            salary=salary+1000;
        }
        System.out.println("The Final Salary is : "+salary);
    }
}
