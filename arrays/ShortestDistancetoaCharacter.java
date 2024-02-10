package arrays;

import java.util.Arrays;

public class ShortestDistancetoaCharacter {

    public static void main(String[] args) {
        String s="loveleetcode";
        char c='e';
        System.out.println(Arrays.toString(shortestToChar(s,c)));
    }

    public static  int[] shortestToChar(String s, char c) {
        int [] distance=new int[s.length()];
        int ans=0;
        int min=0;
       for(int i=0;i<=s.length()-1;i++){

           for(int j=i;j<=s.length()-1;j++){
               if(s.charAt(j)==c){
                    ans=Math.abs(i-j);
                    distance[i]=ans;
                    distance[i]=Math.min(distance[i],ans);
               }
           }
       }
       return distance;

    }
}
