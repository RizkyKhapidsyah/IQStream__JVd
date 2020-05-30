package com.rk.iqs;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Terkopi {
    void copy(String input, String output) {
        FileReader reader;
        FileWriter writer;
        int data;

        try {
            reader = new FileReader(input);
            writer = new FileWriter(output);

            while ((data = reader.read()) != -1) {
                writer.write(data);
            }
            reader.close();
            writer.close();
        } catch (IOException ie) {
            ie.printStackTrace();
            System.out.println(ie);
        }
    }

    public static void main(String[] args) {
        String inputFile = "file.txt";
        String outputFile = "file_copy.txt";

        File_Terkopi cf = new File_Terkopi();
        cf.copy(inputFile, outputFile);

        System.out.println("File '" + inputFile + "' telah tercopy!");
    }
}
