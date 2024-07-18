package com.grayMatter.Assignment;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadCharCount {

    public static void main(String[] args) throws IOException {
        File file = new File("myfile.txt");
        FileReader reader = new FileReader(file);
        
        int charCount = 0;
        int ch;
        while ((ch = reader.read()) != -1) {
            charCount++;
        }
        reader.close();
        
        System.out.println("Number of characters: " + charCount);
    }
}
