package stringBuffer.basics;

public class ReverseString {

    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer("Hello");

        sb1.reverse();
        String result = sb1.toString(); // it's an extra line of code
        System.out.println(result);

        System.out.println("---------------------------------------->");
        sb1.reverse();
        System.out.println(sb1);

        System.out.println("---------------------------------------->");
        reverse(sb1);

    }

    public static void reverse(StringBuffer sb1){
        String reverse = "";

        for(int i = sb1.length()-1; i >= 0; i--){
            reverse += sb1.charAt(i);
        }

        System.out.println(reverse);
    }
}
