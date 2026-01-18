package Collection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Problem1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        System.out.println(list.stream().filter(e -> e ==2).map(e -> e * e).reduce(0,Integer::sum));

    }
}
