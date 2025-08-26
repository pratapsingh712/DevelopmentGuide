package stringBuffer.basics;

public class TrimToCurrentLength {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Raghvendra Pratap Singh");

        System.out.println("Current length of the StringBuffer :"+sb.length());
        System.out.println("Current capacity of StringBuffer :"+sb.capacity());

        System.out.println("---------------------------------------------------->");
        System.out.println("Trimming to it's length :");
        sb.trimToSize();
        System.out.println("New capacity after trimming : "+sb.capacity());
    }
}
