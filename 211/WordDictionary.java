class TrieNode {
    boolean val;
    TrieNode[] next;
    
    public TrieNode() {
        next = new TrieNode[26];
    }
}

public class WordDictionary {
    private TrieNode root;
    
    public WordDictionary() {
        root = new TrieNode();
    }

    // Adds a word into the data structure.
    public void addWord(String word) {
        TrieNode p = root;
        
        for (char c : word.toCharArray()) {
            if (p.next[c - 'a'] == null) {
                p.next[c - 'a'] = new TrieNode();
            }
            p = p.next[c - 'a'];
        }
        
        p.val = true;
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return search(root, 0, word);
    }
    
    private boolean search(TrieNode p, int k, String word) {
        char c = word.charAt(k);
        
        if (k == word.length() - 1) {
            if (c != '.') {
                return p.next[c - 'a'] != null && p.next[c - 'a'].val;
            }
            else {
                for (int i = 0; i < 26; i++) {
                    if (p.next[i] != null && p.next[i].val) {
                        return true;
                    }
                }
                
                return false;
            }
        }
        else {
            if (c != '.') {
                return p.next[c - 'a'] != null && search(p.next[c - 'a'], k + 1, word);
            }
            else {
                for (int i = 0; i < 26; i++) {
                    if (p.next[i] != null && search(p.next[i], k + 1, word)) {
                        return true;
                    }
                }
                
                return false;
            }
        }
    }
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");