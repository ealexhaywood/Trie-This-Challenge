package com.captivation.trie;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ealexhaywood on 4/4/18.
 */
public class SimpleTrieTest {

    @Test
    public void addWordsTest() {
        Trie trie = new SimpleTrie();
        trie.add("hello");
        trie.add("this");
        trie.add("is");
        trie.add("a");
        trie.add("test");

        Assert.assertTrue(trie.contains("hello"));
        Assert.assertTrue(trie.contains("this"));
        Assert.assertFalse(trie.contains("maybe"));
        Assert.assertTrue(trie.contains("is"));
        Assert.assertFalse(trie.contains("not"));
        Assert.assertTrue(trie.contains("a"));
        Assert.assertFalse(trie.contains("good"));
        Assert.assertTrue(trie.contains("test"));

    }
}
