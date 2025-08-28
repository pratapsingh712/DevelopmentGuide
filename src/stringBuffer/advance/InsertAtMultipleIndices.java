package stringBuffer.advance;

import java.util.Arrays;

public class InsertAtMultipleIndices {

    public static void main(String[] args) {

        String str = "xyz";
        StringBuffer sb = new StringBuffer("abcdefghij");
        int position[] = {2,5,8};

        for(int i=position.length-1; i>=0; i--){
            sb.insert(position[i],str);
        }

        System.out.println("String after inserting :"+str+" at every "+ Arrays.toString(position)+" becomes : "+sb.toString());
    }
}
