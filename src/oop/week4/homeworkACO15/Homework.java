package oop.week4.homeworkACO15;

import oop.io.NullExeption;

import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Homework implements ComandInterface {


    @Override
    public String less(String path) throws FileNotFoundException {
        Reader reader = new FileReader(path);

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

    @Override
    public void writeInto(String content, String path) throws FileNotFoundException {
        try (OutputStream os = new FileOutputStream(path)) {
            os.write(content.getBytes());
        } catch (IOException e) {
            throw new FileNotFoundException();
        }
    }

    @Override
    public void appendTo(String path, String content) {
        try {
            Files.write(Paths.get(path), content.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
        }
    }

    public void showDir() {
        System.out.println(Paths.get(".").toAbsolutePath().normalize().toString());
    }

    @Override
    public List<String> ls(String currentDirPath) {
        return null;
    }

    @Override
    public boolean touch(String path) {
        File file = new File(path);
        return true;
    }

    @Override
    public boolean delete(Path path) {
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
        }
        return true;
    }

    @Override
    public boolean copy(Path src, Path dest) {
        try {
            Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
            return false;
        } catch (IOException e) {
        }
        return true;
    }

    @Override
    public List<String> grep(Path src, String keyWord) {
        try {
            Stream<String> streamFromFiles = Files.lines(src).distinct()
                    .filter(keyWord::equals).collect(Collectors.toList());
        } catch (IOException e) {
        }

    }
}
