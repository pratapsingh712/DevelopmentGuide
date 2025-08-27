package stringBuffer.intermediate;

public class MergeTwoStringBuffer {
    public static void main(String[] args) {
        String str1 = "Programming";
        String str2 = " Hello World";

        StringBuffer sb1 = new StringBuffer(str1);
        StringBuffer sb2 = new StringBuffer(str2);

        sb1.append(sb2);

        System.out.println("original String one : "+str1);
        System.out.println("original String two :"+str2);

        System.out.println("after merging both the string :"+sb1);

    }
}
