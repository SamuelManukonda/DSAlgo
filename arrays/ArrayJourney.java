package arrays;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ArrayJourney {

    public static void main(String[] args) {

        List<Integer> integers = List.of(100, -80, -70, -90, -80, 100);// mastp= 3 o/p 130

        List.of(3, -4, -3, -5, 0); // step =2  o/p 0
        List.of(10, 2, -10, 5, 20); // step =2 o/p 37
        long journey = journey(integers, 3);
        System.out.println(journey);
    }

    public static long journey(List<Integer> path, int maxStep) {
        int currentSum = path.get(0);
        int max = currentSum;
        for (int i = 1; i < path.size() - 1; i++) {
            for (int j = i + 1; j < maxStep; j++) {
                int sum = currentSum + path.get(j);
                max = Math.max(max, sum);

                //currentSum = Math.max(path.get(j+1),sum);
                //max=Math.max(currentSum, max);
            }

        }
        return max;

    }
}
