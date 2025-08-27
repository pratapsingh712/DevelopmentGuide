package stringBuffer.intermediate;

public class CompareStringBuffer {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("I Love Programming:");
        StringBuffer sb1 = new StringBuffer("I Love Programming:");
        StringBuffer sb2 = new StringBuffer("I love java:");

        // compare the StringBuffers

        System.out.println("sb and sb1 are equal :"+sb.toString().equals(sb1.toString()));
        System.out.println("sb and sb1 have same reference :"+sb.equals(sb1));
        System.out.println("sb1 and sb2 are equal :"+sb.toString().equals(sb2.toString()));

        // can also use contentEquals method
        String str = sb.toString();

        System.out.println("sb and sb1 are equal :"+str.contentEquals(sb1));
    }
}
