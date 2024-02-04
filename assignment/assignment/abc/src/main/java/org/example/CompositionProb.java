package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CompositionProb {
    public static boolean isCompoundedWord(String word, Set<String> wordSet) {
        if (wordSet.contains(word)) {
            return true;
        }
        for (int i = 1; i < word.length(); i++) {
            String prefix = word.substring(0, i);
            String suffix = word.substring(i);

            if (wordSet.contains(prefix) && isCompoundedWord(suffix, wordSet)) {
                return true;
            }
        }
        return false;
    }

    public static String findLongestCompoundedWord(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length).reversed());
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        for (String word : words) {
            wordSet.remove(word);
            if (isCompoundedWord(word, wordSet)) {
                return word;
            }
        }
        return null;
    }

    public static String findSecondLongestCompoundedWord(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length).reversed());
        String longestCompoundedWord = findLongestCompoundedWord(words);

        if (longestCompoundedWord == null) {
            return null;
        }

        List<String> remainingWords = new ArrayList<>(Arrays.asList(words));
        remainingWords.remove(longestCompoundedWord);

        return findLongestCompoundedWord(remainingWords.toArray(new String[0]));
    }

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            long startTime = System.currentTimeMillis();


            try (BufferedReader reader = new BufferedReader(new FileReader("Input_0" + (i + 1) + ".txt"))) {
                String line;
                StringBuilder txtContent = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    txtContent.append(line.trim()).append("\n");
                }
                String[] words = txtContent.toString().split("\n");
                System.out.println("Longest Compound Word: " + findLongestCompoundedWord(words));
                System.out.println("Second Longest Compound Word: " + findSecondLongestCompoundedWord(words));
                long processingTime = System.currentTimeMillis() - startTime;
                System.out.println("Time taken to process file Input_0" + (i + 1) + ".txt: " + processingTime + " milli seconds");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}