package oop.library;

import oop.library.controller.Library;
import oop.library.exeptions.AppExeption;
import oop.library.models.Edition;
import oop.library.models.Genre;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibraryTest {
    private final static String DEFAULT_PATH = "myFile";
    private Library library;

    @Before
    public void setUp() throws Exception {
        library = new Library(new ArrayList<>());
    }

    @BeforeClass
    public static void beforeClass() throws IOException {
        Files.write(Paths.get(DEFAULT_PATH), "[Book], 1994, some book, nastya, DEFAULT_PATH, Genre.DRAMA, 3423423AFB".getBytes(), StandardOpenOption.CREATE);
    }

    @AfterClass
    public static void tearDown() throws Exception {
        Files.deleteIfExists(Paths.get(DEFAULT_PATH));
    }

    @Test
    public void testAddBook_Positive() throws AppExeption {
        library.addBook("1994", "some book", "nastya", DEFAULT_PATH, Genre.DRAMA, "3423423AFB");
        List<Edition> books = library.search("some book", null, null);
        Assert.assertEquals(1, books.size());
    }

    @Test(expected = AppExeption.class)
    public void testAddBook_Negative() throws AppExeption {
        library.addBook("1994", "some book", "nastya", "dfdsfds", Genre.DRAMA, "3423423AFB");
    }

    @Test
    public void testAddMagazine_Pozitive() throws AppExeption {
        library.addMagazine("2000", "some magazine", "N", DEFAULT_PATH, LocalDate.ofEpochDay(2000-01-02), "12345QWE");
        List<Edition> magazine = library.search("some magazine", null, null);
        Assert.assertEquals(1, magazine.size());

    }

    @Test(expected = AppExeption.class)
    public void testAddMagazine_Negative() throws AppExeption {
        library.addMagazine("2000", "some magazine", "N", DEFAULT_PATH, LocalDate.ofEpochDay(2000-01-02), null);
    }

    @Test
    public void testSearch_Positive() throws AppExeption {
        library.addBook("1994", "some book", "nastya", DEFAULT_PATH, Genre.DRAMA, "3423423AFB");
        library.search("some book", "nastya", null);
    }

    @Test
    public void testSearch_Negative() throws AppExeption {
        library.addBook("1994", "some book", "nastya", DEFAULT_PATH, Genre.DRAMA, "3423423AFB");
        library.search("uutg", null, null);
    }

    @Test
    public void testWriteToLib_Positive() throws AppExeption, IOException {
        library.addBook("1994", "some book", "nastya", DEFAULT_PATH, Genre.DRAMA, "3423423AFB");
        library.writeToLib("bla");
    }
    @Test(expected = AppExeption.class)
    public void testWiteToLib_Negative() throws AppExeption, IOException {
        library.addBook("1994", "some book", "nastya", "huduh", Genre.DRAMA, "3423423AFB");
        library.writeToLib("bla");
    }

    @Test
    public void testRead() throws IOException {
        library.readContent(DEFAULT_PATH);
    }

    @Test(expected = IOException.class)
    public void testRead_Negative() throws IOException {
        library.readContent("hyhih");
    }

    @Test(expected = IOException.class)
    public void testDownload_Negative() throws IOException, AppExeption {
    }
}
