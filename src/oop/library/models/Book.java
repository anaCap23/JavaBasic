package oop.library.models;

public class Book extends Edition {
    private Genre genre;
    private String numISBN;

    public Book(String year, String author, String path, String name, Genre genre, String numISBN) {
        super(year, author, path, name);
        this.genre = genre;
        this.numISBN = numISBN;
    }

    @Override
    public String toString() {
        return "[Book]" + " - " + getYear() + " - " + getAuthor() + " - " + getPath() + " - " + getName() + " - " + getGenre() + " - " + getNumISBN();
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getNumISBN() {
        return numISBN;
    }

    public void setNumISBN(String numISBN) {
        this.numISBN = numISBN;
    }
}
