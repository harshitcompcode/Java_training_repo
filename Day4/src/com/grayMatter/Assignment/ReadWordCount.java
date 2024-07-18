package com.grayMatter.Assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadWordCount {

    public static void main(String[] args) throws IOException {
        File file = new File("myfile.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        
        String line;
        int wordCount = 0;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            wordCount += words.length;
        }
        reader.close();
        
        System.out.println("Number of words: " + wordCount);
    }
}
