package Interview;

import java.util.HashMap;
import java.util.Map;

public class FindOccurrenceOfWord {

    public static void main(String[] args) {
        String str = "Fear leads to anger anger; leads to hatred; hatred leads to conflict; conflict leads to suffering.";
        findOccurrence(str);

    }

    private static void findOccurrence(String str) {
        String[] s = str.split(" ");
        Map<String, Integer> map=new HashMap<>();
        for(int i=0;i< s.length;i++){
            if(map.containsKey(s[i])){
                map.put(s[i],map.get(s[i])+1);
            }else {
                map.put(s[i],1);
            }
        }
        map.forEach((key, value) -> System.out.println(key + "  - " + value));

    }
}
