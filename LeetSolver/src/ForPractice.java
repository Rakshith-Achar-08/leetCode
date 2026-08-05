import java.util.*;

public class ForPractice {
    static void main() {
        String str = "Hello";
        Stack<Character> stack= new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int i =0; i<str.length();i++){
            System.out.println(""+str.charAt(i));
        }

    }
}