package arrays;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {
        Interval i1 = Interval.builder().start(1).end(3).build();
        Interval i2 = Interval.builder().start(6).end(9).build();
        Interval test= Interval.builder().start(2).end(6).build();
        List<Interval> intervals = new ArrayList<>(List.of(i1, i2));
        int index=0;

        ArrayList<Interval> result = new ArrayList<>();
        result.add(0,intervals.get(0));
        for(int i=1;i<intervals.size();i++){
            int start=intervals.get(i).start;
            int end=intervals.get(i).end;
            int prevStart=result.get(result.size()-1).start;
            if(start<=end){
                intervals.get(i).end=Math.max(prevStart,end);
                result.add(intervals.get(i));
            }else{
                result.add(intervals.get(i));
            }
        }

        for(int i=0;i< intervals.size();i++){
            if(intervals.get(i).start<= test.end) {
                intervals.get(i).end = Math.max(intervals.get(i).end, test.end);
            }
        }

        intervals.forEach(System.out::println);
    }
}
