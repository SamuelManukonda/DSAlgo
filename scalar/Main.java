package scalar;

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int first=n;
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=rev*10 +d;
            n=n/10;
        }
        if(first==rev) System.out.println("Yes");
        else System.out.println("No");
    }
}