import java.util.*;

public class ForPractice {
    static void main() {
        String[] str ={"Hell", "Hello"};

//        if(str == null){
//            return "";
//        }

        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }

        String prefix = str[0];

        for(int i=0; i<str.length;i++){
            while(!str[i].startsWith(prefix)){
                prefix=prefix.substring(0, prefix.length()-1);
            }
        }

        System.out.println(prefix);


    }
}