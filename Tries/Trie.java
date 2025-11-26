package Tries;

public class Trie {

    private TrieNode root;

    public Trie() {
        this.root = new TrieNode(26);
    }

    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            current = current.getChildren()[ch - 'a'];
            if ((current == null)) {
                current = new TrieNode(26);
                current = current.getChildren()[ch - 'a'];
            }
            current.isLastWord = true;
        }

    }

    public boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            current = current.getChildren()[ch - 'a'];
            if (current == null) {
                return false;
            }
            current = current.getChildren()[ch - 'a'];
        }
        return current.isLastWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            current = current.getChildren()[ch - 'a'];
            if (current == null) {
                return false;
            }
            current = current.getChildren()[ch - 'a'];

        }
        return true;
    }

}
