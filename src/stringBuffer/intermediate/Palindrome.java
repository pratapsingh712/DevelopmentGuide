package stringBuffer.intermediate;

public class Palindrome {

    public static void main(String[] args) {

        String original = "mom";
        StringBuffer sb = new StringBuffer(original);

        String reverse = sb.reverse().toString();

        if(reverse.equals(original)){
            System.out.println("Palindrome:");
        }else{
            System.out.println("Not a Palindrome:");
        }

    }
}
