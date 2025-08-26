package stringBuffer.basics;

public class ConvertSBToStr {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Raghvendra!");
        String str = sb.toString();

        System.out.println("String: "+str);
        System.out.println("String Buffer :"+sb);

    }
}
