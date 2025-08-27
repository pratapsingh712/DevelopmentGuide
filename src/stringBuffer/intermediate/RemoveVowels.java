package stringBuffer.intermediate;

public class RemoveVowels {

    public static void main(String[] args) {
        String original = "Thii is vowel check happening!";
        StringBuffer sb = new StringBuffer(original);

        String vowels = "aeiouAEIOU";

        for(int i=0;i<sb.length()-1;i++){
            char currentLetter = sb.charAt(i);

            if(vowels.indexOf(currentLetter)!=-1){
                sb.deleteCharAt(i);
                i--; // because character will be shifted one position to the left after deletion so I need to decrement to check if the moved char is vowel or not
                // running a loop backward here is better
            }
        }

        System.out.println("Original String : "+original);
        System.out.println("After removing all the vowels :"+sb);
    }
}