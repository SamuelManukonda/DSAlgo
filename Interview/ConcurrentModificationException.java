package Interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationException {

    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        list.addAll(integers);
        for(int i=0;i<integers.size();i++){
            list.add(i);
        }

        list.forEach(System.out::println);
    }
}
