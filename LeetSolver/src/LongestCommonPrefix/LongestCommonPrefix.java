package LongestCommonPrefix;

public class LongestCommonPrefix {

    // Function to find longest common prefix
    public static String longestCommonPrefix(String[] strs) {

        //Checking if given strs is empty or not.
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Assuming first string which is going to compair.
        String prefix = strs[0];

        // Compare prefix with each string
        for (int i = 1; i < strs.length; i++) {

            // Shortening prefix until it matches by using substring() methods
            // startsWith() is used to check whether the string start with the given character. And it return true or false
            while (!strs[i].startsWith(prefix)) {
                // used '!', which means until it becomes null. keep on iterate

                // Updating the prefix. substring() is a method.
                prefix = prefix.substring(0, prefix.length() - 1);

                // No common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {

        String[] input = {"flower", "flow", "flight"};

        String result = LongestCommonPrefix.longestCommonPrefix(input);

        System.out.println("Input Strings:");
        for (String s : input) {
            System.out.println(" - " + s);
        }

        System.out.println("\nLongest Common Prefix: " + result);
    }
}
