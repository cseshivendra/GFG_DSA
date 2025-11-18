package Array;

public class WordCount {
    public static void main(String[] args) {
        String input = "I am a Software Developer";

        String[] words = input.trim().split("\\s+");
        int countwords = words.length;
        System.out.println("Number of words : "+ countwords);
    }
}
