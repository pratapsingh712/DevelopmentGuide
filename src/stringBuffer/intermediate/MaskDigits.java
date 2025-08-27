package stringBuffer.intermediate;

public class MaskDigits {

    public static void main(String[] args) {
        String sentence = "rpsingh09mar@978987987";
        StringBuffer sb = new StringBuffer(sentence);

        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(Character.isDigit(ch)){
                sb.setCharAt(i,'*');
            }
        }

        System.out.println("original string :"+sentence);
        System.out.println("after masking the digits :"+sb);
    }
}
