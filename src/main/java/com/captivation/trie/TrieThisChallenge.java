package com.captivation.trie;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ealexhaywood on 4/4/18.
 */
public class TrieThisChallenge {

    private static Trie trie = new SimpleTrie();

    public static void main(String[] args) {
        // Declare scanner to get user input
        Scanner scanner = new Scanner(System.in);
        boolean promptUser = true;
        do {
            displayUserMenu();
            System.out.print("Please enter a choice:  ");

            try {
                int choice = scanner.nextInt();

                String word;
                boolean success;
                switch (choice) {
                    case 1:
                        System.out.print("Enter the word you want to add to the trie:  ");
                        word = scanner.next();
                        System.out.println();
                        success = trie.add(word);
                        if (success) {
                            System.out.println(word + " was successfully added.");
                        } else {
                            System.out.println(word + " already exists in the trie.");
                        }
                        break;
                    case 2:
                        System.out.print("Enter word to see if its contained in the trie:  ");
                        word = scanner.next();
                        System.out.println();
                        success = trie.contains(word);
                        if (success) {
                            System.out.println(word + " is in the trie.");
                        } else {
                            System.out.println(word + " is not in the trie.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter prefix to get a list of words that begin with it:  ");
                        String prefix = scanner.next();
                        System.out.println();
                        List<String> words = trie.search(prefix);
                        if (words == null) {
                            System.out.println("Nothing begins with " + prefix);
                        } else {
                            System.out.println("Words that begin with " + prefix + ":");
                            for (String w : words) {
                                System.out.println(w);
                            }
                        }
                        break;

                    // exit
                    case 0:
                        System.out.println("Exiting...");
                        promptUser = false;
                        break;

                    // invalid/other choices
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }


            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Your choice was not a number.");
                scanner.next(); // consume the invalid token
            }

        } while (promptUser);


    }

    private static void displayUserMenu() {
        System.out.println();
        System.out.println("1 - Add word to trie");
        System.out.println("2 - Check if word is in trie");
        System.out.println("3 - Search for words in trie by prefix");
        System.out.println("0 - Exit");
        System.out.println();
    }
}
