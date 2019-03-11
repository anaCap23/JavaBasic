package oop.library;

import oop.library.controller.Library;
import oop.library.exeptions.AppExeption;
import oop.library.models.Edition;
import oop.library.models.Genre;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibraryTest {
    private final static String DEFAULT_PATH = "myFile";
    private final static String DEFAULT_CONTENT = "[Book], 1994, Thebook, DEFAULT_PATH, myFile, DEFAULT_PATH, DRAMA, 3423423AFB";
    private Library library;

    @Before
    public void setUp() throws Exception {
        library = new Library(new ArrayList<>());
    }

    @BeforeClass
    public static void beforeClass() throws IOException {

        Files.write(Paths.get(DEFAULT_PATH), DEFAULT_CONTENT.getBytes(), StandardOpenOption.CREATE);
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
    public void testSearch_ExistingEdition() throws AppExeption {
        library.addBook("1994", "some book", "nastya", DEFAULT_PATH, Genre.DRAMA, "3423423AFB");
        List<Edition>result = library.search("some book", "nastya", null);
        Assert.assertEquals(result.size(), 1);
    }

    @Test
    public void testSearch_NonExistingEdition() throws AppExeption {
        library.addBook("1994", "some book", "nastya", DEFAULT_PATH, Genre.DRAMA, "3423423AFB");
        List<Edition> result = library.search("uutg", null, null);
        Assert.assertEquals(0, result.size());
    }
    @Test
    public void testSearch_AllNullArguments() throws AppExeption {
        library.addBook("1994", "some book", "nastya", DEFAULT_PATH, Genre.DRAMA, "3423423AFB");
        List<Edition> result = library.search(null, null, null);
        Assert.assertEquals(1, result.size());
    }

    @Test
    public void testSaveLibrary_Positive() throws AppExeption, IOException {
        library.addBook("1994", "some book", "nastya", DEFAULT_PATH, Genre.DRAMA, "3423423AFB");
        String savedPath = "bla bla";
        library.saveLibrary(savedPath);
        Path path = Paths.get(savedPath);
        Assert.assertTrue(Files.exists(path));
        Files.deleteIfExists(path);

    }
    @Test(expected = AppExeption.class)
    public void testSaveLibrary_Negative() throws AppExeption, IOException {
        library.addBook("1994", "some book", "nastya", "huduh", Genre.DRAMA, "3423423AFB");
        library.saveLibrary("bla");
    }

    @Test
    public void testRead() throws IOException {
        String content = library.readContent(DEFAULT_PATH);
        Assert.assertNotNull(content);
        Assert.assertTrue(content.length() > 0);
        Assert.assertEquals(DEFAULT_CONTENT, content);
    }

    @Test(expected = IOException.class)
    public void testRead_Negative() throws IOException {
        library.readContent("hyhih");
    }

    @Test
    public void testDownload_Positive() throws IOException, AppExeption {
        library.downloadLib("/home/stace/IdeaProjects/JavaBasic/src/oop/library/TheBook.java");

    }
}
