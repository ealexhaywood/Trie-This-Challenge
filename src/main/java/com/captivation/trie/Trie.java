package com.captivation.trie;

import java.util.List;

/**
 * Created by ealexhaywood on 4/2/18.
 */
public interface Trie {
    /*  adds word to the trie, returning true if the word was successfully added and false if the word was already present. */
    boolean add(String word);

    /*  returns true if the trie contains word and false if it does not. */
    boolean contains(String word);

    /*  returns the list of all words in the trie that begin with prefix. */
    List<String> search(String prefix);
}
