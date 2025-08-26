package stringBuffer.basics;

public class ILoveProgramming {

    public static void main(String[] args) {

        // insert "java " into the string "I love programming" at the correct position.

        StringBuffer sb1 = new StringBuffer();

        sb1.append("I love programming");
        int index = 7;

        sb1.insert(index,"java ");

        System.out.println(sb1);

    }
}
