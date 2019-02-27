package oop.io;

import oop.week1.studyproccess.Student;

import java.io.*;
import java.util.List;

public class IOUtils {
    public static void main(String[] args) {

    }

    public static String readFileContent(String path) throws IOException {
        Reader reader = new FileReader("somefile");

        StringBuilder sb = new StringBuilder();
        char[] buff = new char[1000];

        int count;

        try {
            while ((count = reader.read(buff)) != -1) {
                sb.append(buff, 0, count);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return sb.toString();
    }

    public static void writeFileContent(List<String> content, String path) {

        Writer writer = null;
        try {
            writer = new FileWriter(path);
            for (String part : content) {
                writer.write(part);
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void save(Student student, String path) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(path, true))) {
            printWriter.printf("Student={address : %s, name : %s, age : %d}\n",
                    student.getAddress(),
                    student.getName(),
                    student.getAge());
            printWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getContent(String path) throws FileNotFoundException {
        InputStream is = new FileInputStream(path);
        StringBuilder res = new StringBuilder();

        int val;
        try {
            while ((val = is.read()) != -1) {
                res.append(val);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return res.toString();
    }


}