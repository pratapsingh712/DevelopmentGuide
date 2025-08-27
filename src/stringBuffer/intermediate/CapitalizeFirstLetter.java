package stringBuffer.intermediate;

import java.util.Locale;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String original = "this is a sample sentence";
        StringBuffer sb = new StringBuffer(original);

        // let's capitalize the first letter before any space or comma

        if(sb.length()>0){
            sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
        }

        for(int i=1;i<sb.length()-1;i++){
            if(sb.charAt(i-1)==' ' && Character.isLetter(sb.charAt(i))){
                sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
            }
        }

        System.out.println("Original String :"+original);
        System.out.println("After capitalizing the first character :"+sb);
    }
}
