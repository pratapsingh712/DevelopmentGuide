package stringBuffer.basics;

public class AppendVariousDataTypes {
    public static void main(String[] args) {
        // we are going to append various data types into our StringBuffer

        StringBuffer sb = new StringBuffer();
        sb.append("Hello Raghav you scored ");
        sb.append(100);
        sb.append(" In Maths Alone :");
        sb.append(99.99);
        sb.append(" In Science");

        System.out.println("Student performace :"+sb);
    }
}
