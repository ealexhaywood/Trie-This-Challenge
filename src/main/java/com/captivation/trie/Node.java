package com.captivation.trie;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ealexhaywood on 4/2/18.
 */
public class Node {

    // HashMap containing the child nodes of the current node identified by a single char
    private Map<Character, Node> childNodes;

    // Simple boolean value to identify if we've reached the end of a word
    private boolean end;

    public Node() {
        this.childNodes = new HashMap<>();
        this.end = false;
    }

    public Map<Character, Node> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(Map<Character, Node> childNodes) {
        this.childNodes = childNodes;
    }

    public boolean isEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }
}
