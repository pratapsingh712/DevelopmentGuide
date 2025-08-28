package stringBuffer.advance;

public class RotateRight {

    public static void main(String[] args) {

        String str = "Programming";
        int k = 12; // right rotate by 3 position

        String result = "";

        result = rightRotate(str,k);
        System.out.println("Original String : "+str);
        System.out.println("After rotating by :"+k+" position from right :"+result);

    }

    public static String rightRotate(String str, int rotate){

        if(str==null || str.length()==0 || rotate<=0){
            return str;
        }

        int n = str.length();

        // handle cases where k is larger than string length
         rotate = rotate % n;

         StringBuffer sb = new StringBuffer(str);

         // first call the reverse method to reverse the second half part

        reverse(sb, n-rotate, n-1);

        // now let's call it for the first half

        reverse(sb,0, n-rotate-1);

        // now let's call it for the full length

        reverse(sb, 0, n-1);

        return sb.toString();
    }

    public static void reverse(StringBuffer sb, int start, int end){

        while(start<end){
            char temp = sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,temp);
            start++;
            end--;
        }
    }
}
