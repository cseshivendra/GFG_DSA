package Collection;

import java.util.ArrayList;
import java.util.Collections;  // Import the utility class
import java.util.List;         // Import List interface

public class LargestNo {  // Renamed class to avoid conflict

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(14);
        values.add(51);
        values.add(1);
        values.add(14);
        values.add(17);

        System.out.println("Max value: " + Collections.max(values));

        // Print all values
        //values.forEach(val -> System.out.println(val));
    }
}
