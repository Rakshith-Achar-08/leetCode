import java.util.*;
// this is not an actual code for the file that has mentioned.
public class CommonPrefix {
    // A method to sort the character by character ussing bubble sort
    public char[] sorting(String str){
        char cha[]=str.toCharArray(); //.toCharArray() is used to convert the string to character.
        int i,j;
        int n=str.length();
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(cha[i]>cha[j]){
                    char temp = cha[i];
                    cha[i]=cha[j];
                    cha[j]=temp;
                }
            }
        }
        return cha;
    }

    public char[] compare(String str1, String str2){
        char firstString[]=str1.toCharArray();
        char secondString[]=str2.toCharArray();
        int n = firstString.length;
        int m = secondString.length;
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(firstString[i]==secondString[j]){
                    return secondString;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        CommonPrefix cp = new CommonPrefix();
        int n=100;
        String str[] = {"rakshi", "rakshith"};
        for(int i=0;i<str.length;i++){
            System.out.println("Sorted names are: "+new String(cp.sorting(str[i])));;
//            String sortedString[i]=str;
            // new String() method is used to convert an array of char[] to string.
        }
    }
}
