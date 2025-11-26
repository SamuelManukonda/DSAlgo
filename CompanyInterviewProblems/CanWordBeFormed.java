package CompanyInterviewProblems;

import java.util.HashMap;
import java.util.Map;

/*
Given a list of words Words = ["baby", "cat", "dada", "dog"] and a random jumbled string like ctay,
write a function find(words, word1) that returns the word if it can be formed from the characters of the given string.
 - Example:
 - find(words, "ctay") → returns "cat"
 - find(words, "dad") → returns "-" (not found)
 */

/*
Solution
Idea-
1. Create a frequency map for the jumbled array.
2. Create a frequency map for each word in the array
3. Check if the word is present by comparing the frequencies

 */
public class CanWordBeFormed {
    public static void main(String[] args) {
        String[] words = {"baby", "cat", "dada", "dog"};
        String jumbledWord = "ctan";
        var result = findWords(words, jumbledWord);
        System.out.println(result);

    }

    private static String findWords(String[] words, String jumbledWord) {
        Map<Character, Integer> jumbledMap = new HashMap<>();
        //Create a frequency map for the jumbled array.
        getFrequencyOfCharacters(jumbledWord, jumbledMap);
        Map<Character, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.clear();
            // Create a frequency map for each word in the array
            for (int j = 0; j < word.length(); j++) {
                wordMap.put(word.charAt(j), wordMap.getOrDefault(word.charAt(j), 0) + 1);
            }
            // Check if the word is present by comparing the frequencies
            if (canFormWord(wordMap, jumbledMap)) {
                return word;
            }

        }
        return "-";
    }

    private static boolean canFormWord(Map<Character, Integer> wordMap, Map<Character, Integer> jmap) {
        for (char c : wordMap.keySet()) {
            // Check if the character of jumbled array exists in the word array
            if (!jmap.containsKey(c)) {
                return false;
            }
            // check frequencies of each character in each map
            if (jmap.get(c) < wordMap.get(c)) {
                return false;
            }
        }
        return true;
    }

    private static void getFrequencyOfCharacters(String jumbledWord, Map<Character, Integer> jmap) {

        for (int i = 0; i < jumbledWord.length(); i++) {
            jmap.put(jumbledWord.charAt(i), jmap.getOrDefault(jumbledWord.charAt(i), 0) + 1);
        }

    }
}
