package Trie;

public class ImplementTriePrefixTree 
{
    static class Node {
        Node[] children = new Node[26];
        boolean end = false;
    }

    private Node root;

    public ImplementTriePrefixTree() {
        this.root = new Node();
    }

    public void insert(String word) {
        Node n = root;
        for (char c : word.toCharArray()) {
            if (n.children[c - 'a'] == null) {
                n.children[c - 'a'] = new Node();
            }
            n = n.children[c - 'a'];
        }
        n.end = true;
    }

    private Node findLast(String str) {
        Node n = root;
        for (int i = 0; i < str.length() && n != null; ++i) {
            n = n.children[str.charAt(i) - 'a'];
        }
        return n;
    }

    public boolean search(String word) {
        Node n = findLast(word);
        return n != null && n.end;
    }

    public boolean startsWith(String prefix) {
        Node n = findLast(prefix);
        return n != null;
    }
}
