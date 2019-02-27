package oop.io;

import java.io.*;

public class TryTwo {
    public static void main(String[] args) throws NullExeption {
        String readFile = readFile("somefile");
        System.out.println(readFile);
    }

    public static String readFile(String path) throws NullExeption {
        StringBuilder sb = new StringBuilder();
        int val;

        try (InputStream is = new FileInputStream(path)) {
            while (is.available() != -1 && is.available() != 0) {
                while ((val = is.read()) != -1) {
                    sb.append(val);
                }
            }
        } catch (IOException e) {
            throw new NullExeption(e.getMessage());
        }
        return sb.toString();
    }

    public static void writeToFile(String content, String path) throws NullExeption {
        try (OutputStream os = new FileOutputStream(path)) {
            os.write(content.getBytes());
        } catch (IOException e) {
            throw new NullExeption(e.getMessage());
        }
    }

    public static String readFileContent(String path) throws NullExeption {
        StringBuilder sb = new StringBuilder();
        char[] buff = new char[1000];
        int count;

        try (Reader reader = new FileReader(path)) {
            while ((count = reader.read(buff)) != -1) {
                sb.append(buff, 0, count);
            }
        } catch (IOException ex) {
            throw new NullExeption(ex.getMessage());
        }
        return sb.toString();
    }


    public static void writeFileContent(String content, String path) throws NullExeption {
        try (Writer writer = new FileWriter(path)) {
            writer.write(content);
        } catch (IOException e) {
            throw new NullExeption(e.getMessage());
        }
    }

    public static String bufferReader(String path) throws NullExeption {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((sb.append(br.readLine()) != null)) {
            }
        } catch (IOException ex) {
            throw new NullExeption(ex.getMessage());
        }
        return sb.toString();
    }

    public static void bufferWriter(String path, String content) throws NullExeption {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(content);
        } catch (IOException ex) {
            throw new NullExeption(ex.getMessage());
        }
    }
}
