package oop.io;

import java.io.*;

public class IOvalads {

    public static void main(String[] args) throws IOException {
        writeToFile("dfsdfs\n", "testFile");
        String result = readFile("testFile");
        System.out.println(result);
    }

    private static void writeToFile(String content, String path) throws IOException {
        OutputStream os = new FileOutputStream(path, true);
        byte[] contentBytes = content.getBytes();
        os.write(contentBytes, 0, contentBytes.length);
        os.close();
    }

    private static String readFile(String path) throws IOException {
        InputStream is = new FileInputStream(path);

        String result = "";
        while (is.available() != 0) {
            result += (char) is.read();
        }

        is.close();

        return result;
    }
}