package oop.library.controller;

import oop.library.exeptions.AppExeption;
import oop.library.exeptions.DuplicatedEditionException;
import oop.library.exeptions.EditionNotFoundException;
import oop.library.exeptions.EditionValidationException;
import oop.library.models.Book;
import oop.library.models.Edition;
import oop.library.models.Genre;
import oop.library.models.Magazine;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class Library {

    private List<Edition> editions;

    public Library() {
        editions = new ArrayList<>();
    }

    public Library(List<Edition> editions) {
        this.editions = editions;
    }

    public Book addBook(String year, String name, String author, String path, Genre genre, String numISBN)
            throws AppExeption {

        if (author == null || name == null || numISBN == null || year == null || path == null || genre == null) {
            throw new EditionValidationException("Arguments can't be null!");
        }

        validatePath(path);

        Book book = new Book(year, author, path, name, genre, numISBN);
        editions.add(book);
        return book;
    }

    public Magazine addMagazine(String year, String name, String author, String path,
                                LocalDate dateOfEdit, String serialNumber) throws AppExeption {

        validateArgs(Stream.of(year, name, author, path, dateOfEdit, serialNumber));
        validatePath(path);

        Magazine magazine = new Magazine(year, author, path, name, dateOfEdit, serialNumber);
        editions.add(magazine);
        return magazine;
    }

    public List<Edition> search(String name, String author, String year) {
        return editions.stream()
                .filter(element -> name == null || element.getName().equals(name))
                .filter(element -> year == null || element.getYear().equals(year))
                .filter(element -> author == null || element.getAuthor().equals(author))
                .collect(Collectors.toList());

    }

    public void writeToLib(String path) throws IOException {
        String result = editions.stream()
                .map(Object::toString)
                .collect(Collectors.joining("\n"));
        Files.write(Paths.get(path), result.getBytes(), StandardOpenOption.CREATE);
    }

    public void downloadLib(String path) throws IOException, AppExeption {
        List<String> lines = Files.readAllLines(Paths.get(path));
        for (String line : lines) {
            String[] values = line.split(", ");
            String type = values[0];
            String year = values[1];
            String author = values[2];
            String editionPath = values[3];
            String name = values[4];

            if (type.contains("Book")) {
                Genre genre = Genre.valueOf(values[5].toUpperCase());
                String isbnNum = values[6];
                addBook(year, name, author, editionPath, genre, isbnNum);
            } else {
                LocalDate date = LocalDate.parse(values[5]);
                String serialNum = values[6];
                addMagazine(year, name, author, editionPath, date, serialNum);
            }
        }
    }

    public String readContent(String path) throws IOException {
        return Files.lines(Paths.get(path))
                .collect(Collectors.joining("\n"));
    }

    private void validatePath(String path) throws DuplicatedEditionException, EditionNotFoundException {
        boolean duplicatesFound = editions.stream()
                .anyMatch(currentElement -> currentElement.getPath().equals(path));
        if (duplicatesFound) {
            throw new DuplicatedEditionException("File under path " + path + " does not exist");
        }

        File edFife = new File(path);
        if (!edFife.exists()) {
            throw new EditionNotFoundException("File " + path + " does not exist!");
        }
    }

    private void validateArgs(Stream<Object> args) throws EditionValidationException {
        if (args.anyMatch(Objects::isNull)) {
            throw new EditionValidationException("Not null!");
        }
    }

}