package Array;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCounts {

    public static void main(String[] args) {
        String str = "Java using springboot application";

        Map<String, Long> wordCounts = Arrays.stream(str.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(wordCounts);
    }
}
