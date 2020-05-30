package com.rk.iqs;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Unserialized_Boolean {
    Unserialized_Boolean() {
        Boolean booleanData = null;

        try {
            FileInputStream fis = new FileInputStream("boolean.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            booleanData = (Boolean) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }

        System.out.println("Unserialized Boolean Dari: " + "boolean.ser");
        System.out.println("Boolean Data  = " + booleanData);
        System.out.println("Penggabungan Data dengan true:  " + booleanData.equals(new Boolean("true")));
    }

    public static void main(String[] args) {
        Unserialized_Boolean usb = new Unserialized_Boolean();
    }
}
