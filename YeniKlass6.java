package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;

public class YeniKlass6 {


    public static void main(String[] args) {

        try {

            BufferedReader reader = new BufferedReader(new FileReader("salam.txt"));
            String setr;

            while ((setr = reader.readLine()) != null) {
                System.out.println(setr);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file");

        }


    }


}
