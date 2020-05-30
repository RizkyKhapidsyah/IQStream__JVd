package com.rk.iqs;

import java.io.*;

public class File_Terkopi_2 {
    void copy(String input, String output) {
        BufferedReader reader;
        BufferedWriter writer;
        String data;

        try {
            reader = new BufferedReader(new FileReader(input));
            writer = new BufferedWriter(new FileWriter(output));

            while ((data = reader.readLine()) != null) {
                writer.write(data, 0, data.length());
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
        String outputFile = "file_copy2.txt";

        File_Terkopi_2 ft2 = new File_Terkopi_2();
        ft2.copy(inputFile, outputFile);

        System.out.println("File '" + inputFile + "' telah disalin menjadi : '" + outputFile + "'.");
    }
}
