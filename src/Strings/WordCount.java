package Strings;

public class WordCount {

    public static void main(String[] args) {
        String sentence = "My name is Shivendra Singh";

        //Split on spaces
        String[] words = sentence.trim().split("\\s+");
        int count = words.length;
        System.out.println("Word Count : "+count);
    }
}
