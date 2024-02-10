package Interview;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicatesInArrayUsingStream {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 2, 3, 3, 5, 8, 9);
        Set<Integer> integerSet=new HashSet<>();
//         find duplicates
        Set<Integer> collect = integerStream.filter(val -> !integerSet.add(val)).collect(Collectors.toSet());
        collect.forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        // remove duplicates
        Stream<Integer> integerStream1 = Stream.of(1, 2, 3, 2, 3, 3, 5, 8, 9);
        Set<Integer> integerSet1=new HashSet<>();
        List<Integer> collect1 = integerStream1.filter(val -> integerSet1.add(val)).collect(Collectors.toList());
        collect1.forEach(System.out::println);

    }
}
