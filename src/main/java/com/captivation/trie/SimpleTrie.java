package com.captivation.trie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by ealexhaywood on 4/2/18.
 */
public class SimpleTrie implements Trie {

    private Node rootNode;

    public SimpleTrie() {
        this.rootNode = new Node();
    }

    @Override
    public boolean add(String word) {
        boolean added = false;

        Map<Character, Node> childNodes = rootNode.getChildNodes();
        for (int i = 0; i < word.length(); i++) {
            // If this char doesn't correspond to a child node, then its a new word.
            // Otherwise, continue traversing the trie.
            Node child = childNodes.get(word.charAt(i));
            if (child == null) {
                Node newNode = new Node();
                childNodes.put(word.charAt(i), newNode);
                child = newNode;
                added = true;
            }

            // Get child node's children to continue traversing
            childNodes = child.getChildNodes();

            if (i == (word.length() - 1)) {
                child.setEnd(true);
            }
        }

        return added;
    }

    @Override
    public boolean contains(String word) {
        Map<Character, Node> childNodes = rootNode.getChildNodes();

        Node child = null;
        for (int i = 0; i < word.length(); i++) {
            child = childNodes.get(word.charAt(i));
            // If any char doesn't correspond to a child node, then it doesn't exist in the trie
            // Otherwise, continue traversing the trie.
            if (child == null) {
                return false;
            }

            // Get child node's children to continue traversing
            childNodes = child.getChildNodes();
        }

        // Confirm not null and the node is marked as an end of a word.
        return (child != null && child.isEnd());
    }

    @Override
    public List<String> search(String prefix) {
        Map<Character, Node> childNodes = rootNode.getChildNodes();

        Node child = null;
        for (int i = 0; i < prefix.length(); i++) {
            child = childNodes.get(prefix.charAt(i));

            // If a child doesn't exist, then nothing begins with this prefix
            if (child == null) {
                return null;
            }

            // Get child node's children to continue traversing
            childNodes = child.getChildNodes();
        }

        // Now that we're at the end of the prefix, we can build our words list
        List<String> words = new ArrayList<>();
        if (child.isEnd()) {
            words.add(prefix);
        }

        // Our recursive words list function
        buildWordsList(prefix, words, child);

        return words;
    }

    private void buildWordsList(String prefix, List<String> words, Node node) {
        Map<Character, Node> childNodes = node.getChildNodes();
        for (Map.Entry<Character, Node> entry : childNodes.entrySet()) {
            Character c = entry.getKey();
            Node child = entry.getValue();

            // If node is end of a word, add it to the list!
            if (child.isEnd()) {
                words.add(prefix + c);
            }

            // Otherwise, get its child nodes and pass the prefix + the next node's char value
            if (!child.getChildNodes().isEmpty()) {
                buildWordsList(prefix + c, words, child);
            }
        }
    }

}
