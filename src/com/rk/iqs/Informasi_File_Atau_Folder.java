package com.rk.iqs;

import java.io.File;

public class Informasi_File_Atau_Folder {
    public static void main(String[] args) {
        String fileName = "file.txt";
        File fn = new File(fileName);

        System.out.println("Nama  : " + fn.getName());

        if (!fn.exists()) {
            System.out.println(fileName + " Tidak Ditemukan!");
            /* Membuat Sebuah Direktori Temporary */
            System.out.println("Membuat Direktori Temporari...");

            fileName = "temp";
            fn = new File(fileName);
            fn.mkdir();

            System.out.println(fileName + (fn.exists() ? "exist" : "Tidak Exist"));
            System.out.println("Menghapus direktori temp");
            fn.delete();

            System.out.println(fileName + (fn.exists() ? "Exists" : "Tidak Exist"));
            return;
        }

        System.out.println(fileName + " adalah sebuah " + (fn.isFile() ? "file." : "direktori."));

        if (fn.isDirectory()) {
            String content[] = fn.list();
            System.out.println("Isi dari direktori ini");

            for (int i = 0; i < content.length; i++) {
                System.out.println(content[i]);
            }
        }

        if (!fn.canRead()) {
            System.out.println(fileName + " tidak Readable");
            return;
        }

        System.out.println(fileName + " adalah " + fn.length() + " bytes long.");
        System.out.println(fileName + " adalah " + fn.lastModified() + " bytes long.");

        if (!fn.canWrite()) {
            System.out.println(fileName + " tidak Writable!");
        }
    }
}
