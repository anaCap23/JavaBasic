package oop.week4.homeworkACO15;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.List;

public interface ComandInterface {

    // show file content
    String less(String path) throws FileNotFoundException;

    void writeInto(String path, String content) throws FileNotFoundException;

    void appendTo(String path, String content) throws FileNotFoundException;

    // show files in current directory
    List<String> ls(String currentDirPath);

    // use File
    // create new file
    boolean touch(String path);

    boolean delete(Path path);

    boolean copy(Path src, Path dest);

    List<String> grep(Path src, String keyWord);

    //shallow copy
    // use standard clone mechanism in java
    Object clone(Object obj);
}
