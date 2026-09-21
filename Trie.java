import java.util.*;

public class Solution {

    static class TrieNode {
        TrieNode[] child = new TrieNode[26];
        boolean isEnd = false;
    }

    static TrieNode root = new TrieNode();

    // Insert a word into Trie
    static void insert(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';

            if (current.child[index] == null) {
                current.child[index] = new TrieNode();
            }

            current = current.child[index];
        }

        current.isEnd = true;
    }

    // Search a word in Trie
    static boolean search(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';

            if (current.child[index] == null) {
                return false;
            }

            current = current.child[index];
        }

        return current.isEnd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String input = sc.nextLine();
        String[] words = input.split(",");

        for (String word : words) {
            insert(word);
        }

        String searchWord = sc.nextLine();

        if (search(searchWord)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}
