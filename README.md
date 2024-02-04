## Overview
This Java program is designed to find the longest and second-longest compounded words within a given set of words. The program reads input from two text files ("Input_01.txt" and "Input_02.txt") and outputs the results.

## Contents
- [CompositionProb.java](CompositionProb.java): The main Java source code file containing the program logic.
- [Input_01.txt](Input_01.txt): Sample input file containing a list of words (for testing).
- [Input_02.txt](Input_02.txt): Sample input file containing a different list of words (for testing).
- [README.md](README.md): This documentation file.

## How to Run
1. Ensure you have a Java Runtime Environment (JRE) installed on your system.
2. Compile the Java program using a Java compiler:
   ```bash
   javac CompositionProb.java

Program Logic
The program consists of three main methods:

isCompoundedWord(String word, Set<String> wordSet): Checks if a word can be formed by concatenating two or more words from the given set.
findLongestCompoundedWord(String[] words): Finds the longest compounded word in an array of words.
findSecondLongestCompoundedWord(String[] words): Finds the second-longest compounded word in an array of words.
The main method reads input from two text files, processes the content, and prints the results.

Input Files
Modify or replace the content of the "Input_01.txt" and "Input_02.txt" files to test the program with different sets of words.

AUTHOR 
Himanshu Kumar Singh
