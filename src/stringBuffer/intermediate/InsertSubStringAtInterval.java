package stringBuffer.intermediate;

public class InsertSubStringAtInterval {

    public static void main(String[] args) {

        String original = "1234567890abcdef";
        String substringToInsert = "-";

        int interval = 3;
        String insertValue = "-";

        int insertLength = insertValue.length();

        StringBuffer sb = new StringBuffer(original);

        for(int i=interval;i<sb.length();i=i+interval+insertLength){
            sb.insert(i,insertValue);
        }

        System.out.println("Original String :"+original);
        System.out.println("After inserting at position :"+sb.toString());

    }
}
