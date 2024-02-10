package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Write a program to find even numbers from a list of integers and multiply with 2 using stream java 8?
public class MultiplyNumbers {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // just multiply even numbers by 2
        List<Integer> collect = integers.stream().filter(val -> val % 2 == 0).map(integer -> integer * 2).collect(Collectors.toList());
        // Sum of even numbers
        int sum = integers.stream().filter(val -> val % 2 == 0).map(integer -> integer * 2).mapToInt(value -> value).sum();
        System.out.println("Even numbers multiply by 2 " + collect);
        System.out.println("Sum of the even number " + sum);

    }
}
