package com.rk.iqs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Terbentuk_File_Boolean {

    Terbentuk_File_Boolean() {
        Boolean booleanData = new Boolean("true");

        try {
            FileOutputStream fos = new FileOutputStream("boolean.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(booleanData);
            oos.close();
        } catch (IOException ie) {
            ie.printStackTrace();
            System.out.println(ie);
        }
    }

    public static void main(String[] args) {
        Terbentuk_File_Boolean tfb = new Terbentuk_File_Boolean();
    }
}
