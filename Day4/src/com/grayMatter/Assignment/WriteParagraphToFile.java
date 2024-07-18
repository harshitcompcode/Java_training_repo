package com.grayMatter.Assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteParagraphToFile {

    public static void main(String[] args) throws IOException {
        String content = "This is a sample paragraph.\n" +
                         "It has multiple lines and words.\n" +
                         "I am Harshit and I work in GrayMatter .\n"+
                         "This will replace all the s with *.";
        
        
        File file = new File("myfile.txt");
        FileWriter writer = new FileWriter(file);
        writer.write(content);
        writer.close();
        
        System.out.println("Paragraph written to file: " + file.getPath());
        
        
        
        
    }
}
