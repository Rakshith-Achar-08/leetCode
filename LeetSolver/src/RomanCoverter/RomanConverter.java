import java.util.*;

public class RomanConverter {

    public int convert(char r){
        //This method is to return a specific value to specific roman letter;
        if(r=='I'){
            return 1;
        }
        if(r=='V'){
            return 5;
        }
        if(r=='X'){
            return 10;
        }
        if(r=='L'){
            return 50;
        }
        if(r=='C'){
            return 100;
        }
        if(r=='D'){
            return 500;
        }
        if(r=='M'){
            return 1000;
        }
        return -1;
    }
    public int convertToRoman(String s){
        int i, res, s1, s2;
        //initializing the result with 0;
        res=0;
        //traversing till end of the given string
        for(i=0;i<s.length();i++){
            s1=convert(s.charAt(i)); //storing the return value from convert method based on character present in ith index by using chatAt(i) method
            //checking if string contain succeeding character which is i+1 and again storing value to s2 
            if(i+1<s.length()){
                s2 = convert(s.charAt(i+1));
                if(s1>=s2){ //for ex: XV(15), X=10, V=5. 10>=5;
                    res=res+s1;
                }else{
                    res= res+(s2-s1); //for ex: IV(4), I=1, V=5. So, 5-1=4
                    i++;//jumping to next charater
                }
            }else{
                res = res+s1; //if there is only one character is present, then directly storing s1;
            }
            
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RomanConverter rc = new RomanConverter();
        System.out.println("Enter the roman number: ");
        String romanNumber = scan.nextLine();
        int result = rc.convertToRoman(romanNumber);
        System.out.println(result);
    }
}
