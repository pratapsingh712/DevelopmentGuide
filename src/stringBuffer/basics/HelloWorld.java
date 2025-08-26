package stringBuffer.basics;

public class HelloWorld {

    public static void main(String[] args) {

        // Append a String " World" to "Hello" using StringBuffer and display the result

        StringBuffer sb1  = new StringBuffer("Hello");

        sb1.append(" ");
        sb1.append("World!");

        System.out.println(sb1);
    }
}
