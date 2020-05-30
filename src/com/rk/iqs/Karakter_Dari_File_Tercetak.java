package com.rk.iqs;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PushbackInputStream;

public class Karakter_Dari_File_Tercetak {
    void copy(String input) {
        PushbackInputStream inputStr;
        PrintStream outputStr;
        int data;

        try {
            inputStr = new PushbackInputStream(new FileInputStream(input));
            outputStr = new PrintStream(System.out);

            while ((data = inputStr.read()) != -1) {
                outputStr.println("Membaca Data: " + (char) data);
                inputStr.unread(data);
                data = inputStr.read();
                outputStr.println("Unread Data: " + (char) data);
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
        Karakter_Dari_File_Tercetak kdft = new Karakter_Dari_File_Tercetak();
        kdft.copy(inputFile);
    }

}
