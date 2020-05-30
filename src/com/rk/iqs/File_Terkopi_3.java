package com.rk.iqs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Terkopi_3 {
    void copy(String input, String output) {
        FileInputStream inputStr;
        FileOutputStream outputStr;
        int data;

        try {
            inputStr = new FileInputStream(input);
            outputStr = new FileOutputStream(output);

            while ((data = inputStr.read()) != -1) {
                outputStr.write(data);
            }

            inputStr.close();
            outputStr.close();
        } catch (IOException ie) {
            ie.printStackTrace();
            System.out.println(ie);
        }
    }

    public static void main(String[] args) {
        String inputFile = "file.txt";
        String outputFile = "file_copy3.txt";
        File_Terkopi_3 ft3 = new File_Terkopi_3();
        ft3.copy(inputFile, outputFile);

        System.out.println("File '" + inputFile + "' berhasil dicopy, menjadi: '" + outputFile + "'.");
    }

}
