package stringBuffer.intermediate;

public class ReplaceOccurrences {
    public static void main(String[] args) {
        String sentence = "This is a sentence. What is happening? This is a test.";

        String newString = sentence.replaceAll("is","was");

        System.out.println("Original Sentence :"+sentence);
        System.out.println("Modified Sentence :"+newString);

    }
}
