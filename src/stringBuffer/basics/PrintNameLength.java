package stringBuffer.basics;

public class PrintNameLength {

    public static void main(String[] args) {

        // create a StringBuffer with your name and print it's length and capacity

        StringBuffer nameSuper = new StringBuffer("Hari Om"); // using the StringBuffer Constructor
        System.out.println(nameSuper);

        StringBuffer name = new StringBuffer(); // Created the object of StringBuffer using append method added values to it later
        name.append("Raghvendra");
        name.append(" ");
        name.append("Pratap");

        System.out.println(name);
    }
}
