package stringBuffer.basics;

public class PrintNameLength {

    public static void main(String[] args) {

        // create a StringBuffer with your name and print it's length and capacity

        StringBuffer nameSuper = new StringBuffer("Hari Om");
        System.out.println(nameSuper);

        StringBuffer name = new StringBuffer();
        name.append("Raghvendra");
        name.append(" ");
        name.append("Pratap");

        System.out.println(name);
    }
}
