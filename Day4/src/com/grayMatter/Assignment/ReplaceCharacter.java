package com.grayMatter.Assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceCharacter {

    public static void main(String[] args) throws IOException {
        File file = new File("myfile.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line.replace('s', '*')).append("\n");
        }
        reader.close();
        
        FileWriter writer = new FileWriter(file);
        writer.write(content.toString());
        writer.close();
        
        System.out.println("Replaced 's' with '*' and updated the file.");
        System.out.println(file);
    }
}
