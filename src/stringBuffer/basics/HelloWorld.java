package stringBuffer.basics;

public class HelloWorld {

    public static void main(String[] args) {

        // Append a String " World" to "Hello" using StringBuffer and display the result

        StringBuffer sb1  = new StringBuffer("Hello");

        sb1.append(" ");
        sb1.append("World!");

        System.out.println(sb1);

        // now replace world with java
        System.out.println("------------------------------------->");
        System.out.println("After replacing world with Java: ");
        sb1.replace(6,11,"Java");
        System.out.println(sb1);

        // Now we should delete Java using the delete() method
        System.out.println("------------------------------------->");
        sb1.delete(6,11);
        System.out.println("After deleting Java you will have :");
        System.out.println(sb1);

    }
}
