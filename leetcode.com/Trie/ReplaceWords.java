package Trie;

class TrieNode 
{
    TrieNode[] children;
    String word;
    
    public TrieNode() 
    {
        children = new TrieNode[26];
        word = null;
    }
}
public class ReplaceWords 
{
	static final char SPLITTER = ' ';
    public String replaceWords(List<String> dict, String sentence) 
    {
        String[] array = sentence.split(" ");
        
        //construct the tree
        TrieNode root = new TrieNode();
        for (String word : dict) {
            insert(root, word);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            String successor = findSuccessor(root, array[i]);
            if(successor == null) {
                successor = array[i];
            }
            sb.append(successor).append(SPLITTER);
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
    
    private String findSuccessor(TrieNode root, String word) 
    {
        for (int i = 0; i < word.length(); i++) 
        {
            int index = word.charAt(i) - 'a';
            if (root.children[index] == null) 
            {
                return null;
            }
            if (root.children[index].word != null) 
            {
                return root.children[index].word;
            }
            root = root.children[index];
        }
        return null;
    }
    
    private void insert(TrieNode root, String word) 
    {
        for(int i = 0; i < word.length(); i++) 
        {
            int index = word.charAt(i) - 'a';
            if (root.children[index] == null) 
            {
                root.children[index] = new TrieNode();
            }
            root = root.children[index];
        }
        root.word = word;
    }
}
