package Collection;

import java.util.HashMap;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> values = new TreeMap<>();
        values.put("Shivendra",25);
        values.put("Devendra",null);
        values.put("India",27);
        System.out.println("Values :"+values);

    }
}
