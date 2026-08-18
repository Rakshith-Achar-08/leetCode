package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        int left = 0;
        int right;
        int maximumLenght =0;

        for(right=0;right<s.length();right++){
            while(hashSet.contains(s.charAt(right))){
                hashSet.remove(s.charAt(left));
                left++;
            }
            hashSet.add(s.charAt(right));
            maximumLenght=Math.max(maximumLenght, right-left+1);
        }
        return maximumLenght;
    }



    static void main() {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        String name = "abcabcbb";
        int res = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(name);
        System.out.println(res);



//        System.out.println(ch);
//       for (int i=0;i<name.length();i++){
//           System.out.println(ch[i]);
//       }


    }
}
