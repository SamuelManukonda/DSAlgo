package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfIntegerArrayUsingStream {

    public static void main(String[] args) {
        // Find the sum of all these integers.
        // Criteria are sum all the integers
        //  If odd multiply by 2
        // If even then keep the same number
        // If negative don't do anything.
        List<Integer> integers = Arrays.asList(1, 2, -3, 4, 5, 6, -7, 8, 9, 10);
        int sum = integers.stream().map(val -> {
            if (val % 2 == 1) return val * 2;
            else if (val % 2 == 0) return val;
            else if (val < 0) return 0;
            else return null;
        }).mapToInt(value -> value.intValue()).sum();
                //.collect(Collectors.summingInt(value -> value.intValue())) ;

        System.out.println(sum);
    }
}
