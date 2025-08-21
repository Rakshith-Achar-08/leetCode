import java.util.*;

public class Palindrome2 {
    public boolean isPalindrome(int num){
        int original = num;
        int reversed = 0;
        int remainder;
        if(num<0){
            return false;
        }
        while(num !=0){
            remainder = num %10; //getting the last digit;
            reversed = reversed * 10 + remainder; //adding the last digit to the reversed number;
            num = num / 10; //removing the last digit;
        }
        if(original == reversed){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter the number : ");
        int number = scan.nextInt();
        Palindrome2 pal = new Palindrome2();
        boolean res = pal.isPalindrome(number);
        System.out.println(res);
    }
}
