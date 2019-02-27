package oop.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOhomeworkFromVlad {

    public static String readContent(String path) throws FileNotFoundException {
        InputStream is = new FileInputStream(path);
        StringBuilder res = new StringBuilder();

        int val;
        try {
            while ((val = is.read()) != -1) {
                char convertedIntToChar = (char) val;
                res.append(convertedIntToChar);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return res.toString();
    }

    public static void main(String[] args) throws FileNotFoundException {
        readContent("somefile");
    }
}

