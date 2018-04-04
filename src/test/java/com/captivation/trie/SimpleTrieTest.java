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

        // Assert adding
        Assert.assertTrue(trie.add("hello"));
        Assert.assertFalse(trie.add("hello"));
        Assert.assertTrue(trie.add("this"));
        Assert.assertFalse(trie.add("this"));
        Assert.assertTrue(trie.add("is"));
        Assert.assertFalse(trie.add("is"));
        Assert.assertTrue(trie.add("a"));
        Assert.assertFalse(trie.add("a"));
        Assert.assertTrue(trie.add("test"));
        Assert.assertFalse(trie.add("test"));


        // Assert contains
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
