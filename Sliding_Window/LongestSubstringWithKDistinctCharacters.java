package Sliding_Window;

import java.util.HashMap;
import java.util.Map;

/**
 * Finds the length of the longest substring that contains at most K distinct characters.
 * This is a classic sliding window problem where we maintain a window that can have at most K distinct characters.
 */
public class LongestSubstringWithKDistinctCharacters {

    /**
     * Returns the length of the longest substring with at most 2 distinct characters.
     *
     * @param s The input string
     * @return The length of the longest substring with at most 2 distinct characters
     */
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        // Maximum number of distinct characters allowed in the substring
        int k = 2;
        // Left and right pointers for the sliding window
        int left = 0;
        int right = 0;
        // To store the maximum length found so far
        int maxLength = 0;
        // Map to keep track of characters and their frequencies in the current window
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Expand the window by moving the right pointer
        while (right < s.length()) {
            char rightChar = s.charAt(right);
            // Add the current character to the map or increment its count
            charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar, 0) + 1);

            // If we have more than k distinct characters, shrink the window from the left
            while (charFrequencyMap.size() > k) {
                char leftChar = s.charAt(left);
                // Decrease the count of the character going out of the window
                charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) - 1);
                // Remove the character from the map if its count becomes zero
                if (charFrequencyMap.get(leftChar) == 0) {
                    charFrequencyMap.remove(leftChar);
                }
                // Move the left pointer to the right, shrinking the window
                left++;
            }

            // Move the right pointer to expand the window
            right++;
            // Calculate the current window size and update maxLength if needed
            // Note: right - left (not +1) because right was just incremented
            maxLength = Math.max(maxLength, right - left);
        }

        return maxLength;
    }
}