//Question : To find out whether the given String is Palindrome or not.

package JavaBasics.Assignments;
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.nextLine().toLowerCase();
        if(isPalindrome(str)){
            System.out.println(str+" is a Palindrome.");
        }
        else{
            System.out.println(str+" is not a Palindrome.");
        }
    }
    public static boolean isPalindrome(String str){
        int length=str.length();
        for (int i = 0; i < length/2; i++) {
            if(str.charAt(i) != str.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }
}
