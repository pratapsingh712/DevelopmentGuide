package stringBuffer.intermediate;

public class AppendCharacters {

    public static void main(String[] args) {

        char[] characters = {'a','e','i','o','u'};
        StringBuffer sb = new StringBuffer();

        for(Character ch : characters){
            sb.append(ch);
        }

        System.out.println("String: "+sb.toString());
        sb.delete(0,sb.length());

        // another method is direct method :
        System.out.println("------------------------------->");

        sb.append(characters);
        System.out.println("String: "+sb);
    }
}
