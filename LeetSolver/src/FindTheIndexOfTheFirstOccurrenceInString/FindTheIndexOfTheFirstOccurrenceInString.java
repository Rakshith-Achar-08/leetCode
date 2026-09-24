package FindTheIndexOfTheFirstOccurrenceInString;

public class FindTheIndexOfTheFirstOccurrenceInString {
    public int strStr(String haystack, String needle) {

        int haystackLength = haystack.length();
        int needleLength= needle.length();

        int i;
        String substring = null;
        for(i=0;i<= haystackLength-needleLength;i++){
            substring = haystack.substring(i, i+needleLength);
        }

        if (substring.equals(needle)) {
            return i;
        }

//        int i,j;
//        for(i=0;i<needle.length();i++){
//            for(j=0;j<needle.length();j++){
//                if(haystack.substring(i,j).equals(needle)){
//                    return i;
//                }
//            }
//        }
        return -1;
    }

    static void main() {
        FindTheIndexOfTheFirstOccurrenceInString findTheIndexOfTheFirstOccurrenceInString = new FindTheIndexOfTheFirstOccurrenceInString();
        String hayStack = "sadbutsad";
        String needle = "but";

        int res = findTheIndexOfTheFirstOccurrenceInString.strStr(hayStack, needle);
        System.out.println("The result is: "+res);
    }

}
