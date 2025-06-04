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
public class CanWordBeFormed {
    public static void main(String[] args) {
        String[] words = {"baby", "cat", "dada", "dog"};
        String jumbledWord = "dad";
        var result = findWords(words, jumbledWord);
        System.out.println(result);

    }

    private static String findWords(String[] words, String jumbledWord) {
        Map<Character, Integer> jmap = getFrequencyOfCharacters(jumbledWord);
        Map<Character, Integer> wordMap = new HashMap<>();
        for(int i=0;i<words.length;i++){
            String word = words[i];
        }
    }

    private static Map<Character, Integer> getFrequencyOfCharacters(String jumbledWord) {
        Map<Character, Integer> jmap = new HashMap<>();
        for (int i = 0; i < jumbledWord.length(); i++) {
            jmap.put(jumbledWord.charAt(i), jmap.getOrDefault(jumbledWord.charAt(i), 0) + 1);
        }
        return jmap;

    }
}
