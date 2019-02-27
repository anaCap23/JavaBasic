package oop.library.models;

public class Edition {
    private String year;
    private String author;
    private String path;
    private String name;

    public Edition(String year, String author, String path, String name) {
        this.year = year;
        this.author = author;
        this.path = path;
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAuthor() { return author; }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
