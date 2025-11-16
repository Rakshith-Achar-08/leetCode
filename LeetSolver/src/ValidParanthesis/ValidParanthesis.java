package ValidParanthesis;

import java.util.*;

class Solution{

    public boolean isValid(String str){

        // Using a stack to hold characters of String value;
        Stack<Character> stack = new Stack<>();

        // By using a map. It is represents a collection of key-value pairs,
        // where Keys should be unique, but values can be duplicated.
        Map<Character, Character> map= new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for(char paran : str.toCharArray()){

            //containsKey() method is used to check whether a particular key is being mapped into the HashMap or not.
            // It takes the key element as a parameter and returns True if that element is mapped in the map.
            // the containsKey() method is boolean.

            //if this statement becomes flase, then the character will directly be pushed to stack --v
            if(map.containsKey(paran)){

                //Suppose if condition becomes true (like when the loop encounter ')','}', ']' it is satisfied)

                char topElement = stack.isEmpty() ? '#' : stack.pop();    // <--topElement variale stores the top element by poping.


                if(topElement != map.get(paran)){  // <--this statement is used whether the topElement and current char is same,
                    return false; //<--if it is true, then true, orelse false.
                }
            }else{
                // ^-- here
                stack.push(paran);
            }
        }
        return stack.isEmpty(); //<-- return empty stack is actually an answer for this problem.
    }
}

public class ValidParanthesis {
    static void main() {

        String str1 = "{}";
        String str2 = "[][}";
        Solution solution = new Solution();
        if(solution.isValid(str1)){
            System.out.println("The given parenthesis is valid");
        }else{
            System.out.println("The given parenthesis is not valid");
        }
        if(solution.isValid(str2)){
            System.out.println("The given parenthesis is valid");
        }else{
            System.out.println("The given parenthesis is not valid");
        }


    }
}
