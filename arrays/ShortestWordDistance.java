package arrays;

public class ShortestWordDistance {

    public static void main(String[] args) {

        String str[]={"hi","moon","alpha","book", "bye","hi","mars","pluto", "moon"};
        String str1="moon";
        String str2 ="mars";
        int distance=findTheDistance(str,str1,str2);
        int distance2=findTheDistance2(str,str1,str2);
        System.out.println(distance);
        System.out.println(distance2);
    }

    // Sliding window approach.
    // Take two pointers at the same index increase the window  until your condition is met and decrease it when its met.
    // RUn the x loop until we find "moon" once it is found anchor its index and find the next element element and anchor its index
    // once both the index are found get the Absolute difference.
    private static int findTheDistance2(String[] str, String str1, String str2) {
        int i=-1;
        int j=-1;
        for(int x=0;x<str.length;x++){
            if(str[x].equals("moon")){
                i=x;
            }else if(str[x].equals("mars")){
                j=x;
            }
        }
        return Math.abs(j-i);
    }

    // BruteForce approach where we run a loop until we find the string once we find it we runn another loop of j until we find
    // our next word and calculate the distance . We will do the min search between the indexes to gt the minimum distance.
    private static int findTheDistance(String[] str, String str1, String str2) {
      int ans=0;
        for(int i=0;i<str.length;i++){
            if(str[i].equals("hi")){
                for(int j=0;j< str.length;j++){
                    if(str[j].equals("bye")){
                         ans=j-i;
                         ans=Math.min(ans,j-i);

                    }
                }
            }
        }
        return Math.abs(ans);
    }
}
