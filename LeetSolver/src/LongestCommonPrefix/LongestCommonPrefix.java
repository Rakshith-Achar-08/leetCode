package LongestCommonPrefix;

public class LongestCommonPrefix {

    // Function to find longest common prefix
    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        // Assume first string is the prefix
        String prefix = strs[0];

        // Compare prefix with each string
        for (int i = 1; i < strs.length; i++) {

            // Shorten prefix until it matches
            while (!strs[i].startsWith(prefix)) {
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
