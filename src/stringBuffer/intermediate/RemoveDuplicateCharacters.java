package stringBuffer.intermediate;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {

        String str1 = "Programming";
        String str2 = "Hello World";
        String str3 = "Java programming";

        System.out.println("Original String :"+str1);
        System.out.println("Result -> "+removeDuplicate(str1));
        System.out.println("-------------------------->");
        System.out.println("Original String :"+str2);
        System.out.println("Result -> "+removeDuplicate(str2));
        System.out.println("-------------------------->");
        System.out.println("Original String :"+str3);
        System.out.println("Result -> "+removeDuplicate(str3));
        System.out.println("-------------------------->");
    }

    public static StringBuffer removeDuplicate(String str){
        Set<Character> set = new LinkedHashSet<>();
        StringBuffer sb = new StringBuffer();

        // add characters into the char ch
        for(Character ch : str.toCharArray()){
            set.add(ch);
        }

        // add back these characters into the string buffer

        for(Character ch: set){
            sb.append(ch);
        }

        return sb;
    }
}
