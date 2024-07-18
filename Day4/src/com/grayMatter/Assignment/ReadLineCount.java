package com.grayMatter.Assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineCount {

    public static void main(String[] args) throws IOException {
        File file = new File("myfile.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        
        int lineCount = 0;
        while (reader.readLine() != null) {
            lineCount++;
        }
        reader.close();
        
        System.out.println("Number of lines: " + lineCount);
    }
}
