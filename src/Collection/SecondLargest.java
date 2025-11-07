package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(2);
        values.add(29);
        values.add(25);
        values.add(26);
        values.add(25);
        values.add(22);

        //Reverse the list
        Collections.sort(values,Collections.reverseOrder());

        //Print 2nd Largest
        System.out.println("@nd Largest Number : "+values.get(1));

        //Print all Numbers
        values.forEach(val -> System.out.println(val));
    }
}
