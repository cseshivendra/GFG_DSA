package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class Library {

    public static void main(String[] args) {

        List<Map<String, Object>> books = new ArrayList<>();

        Map<String, Object> book1 = new HashMap<>();
        book1.put("title", "Angular");
        book1.put("tags", Arrays.asList("Angular", "web development"));
        books.add(book1);

        Map<String, Object> book2 = new HashMap<>();
        book2.put("title", "Java");
        book2.put("tags", Arrays.asList("Java", "Backend development"));
        books.add(book2);

        Map<String, Object> book3 = new HashMap<>();
        book3.put("title", "Angular for Professionals");
        book3.put("tags", Arrays.asList("Angular", "web development"));
        books.add(book3);

        Map<String, Object> book4 = new HashMap<>();
        book4.put("title", "Java8");
        book4.put("tags", Arrays.asList("Java", "Backend development for App development"));
        books.add(book4);

        int angularCount = 0;
        int javaCount = 0;

        for (Map<String, Object> book : books) {
            List<String> tags = (List<String>) book.get("tags");

            if (tags != null) {
                if (tags.contains("Angular")) {
                    angularCount++;
                }
                if (tags.contains("Java")) {
                    javaCount++;
                }
            }
        }
        System.out.println("Number of Angular Books: " + angularCount);
        System.out.println("Number of Java Books: " + javaCount);
    }
}