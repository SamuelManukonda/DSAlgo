package Sliding_Window;

import java.util.HashSet;
import java.util.Set;


// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
/*
Right pointer (expands the window) always moves forward.
Left pointer (shrinks the window) only moves forward when needed (to remove duplicates), but not to reset to 0.

When you encounter a duplicate (a character already in the set), you must shrink the window from the left
until that duplicate character is removed (not just check the current left character), so we need to use while loop.
The left pointer doesn't reset to 0—it moves forward incrementally as you remove characters from the set.
The window size (current substring length) is always right - left + 1 (after handling duplicates),
but your set size after removal directly reflects this length.
 */

public class LongestSubstringLengthWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        Set<Character> set = new HashSet<>();
        int maxLength = Integer.MIN_VALUE;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}