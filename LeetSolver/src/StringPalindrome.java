import java.util.*;
public class StringPalindrome {
    public boolean isPalindrome(String x){
        
        int left = 0; //storing string's index(0) to left 
        int right = x.length()-1; //storing string's index(n-1) to right
        while(left<right){
            if(x.charAt(left)!=x.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        StringPalindrome sp = new StringPalindrome();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String str = scan.nextLine();
        boolean result = sp.isPalindrome(str);
        System.out.println(result);
    }
}

