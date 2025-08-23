import java.util.*;
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
    public static void main(String[] args) {
        CommonPrefix cp = new CommonPrefix();
        int n=100;
        String str[] = {"rakshi", "nishu"};
        for(int i=0;i<str.length;i++){
            System.out.println("Sorted names are: "+new String(cp.sorting(str[i])));;
            // new String() method is used to convert an array of char[] to string.
        }
    }
}
