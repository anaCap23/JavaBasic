package oop.library.view;

import oop.library.controller.Library;
import oop.library.models.Edition;
import oop.library.models.Genre;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library(new ArrayList<>());

        System.out.println("choose youre option: ");
        System.out.println("1. add book");
        System.out.println("2. add magazine");
        System.out.println("3. search");
        System.out.println("4. write to library");
        System.out.println("5. read content");
        System.out.println("6. download liibrary");
        System.out.println("0. exit");

        int chosen = Integer.parseInt(sc.nextLine());

        try {
            while (chosen != 0) {
                if (chosen == 1) {
                    System.out.println("enter year, name, path, author, genre(Genre.HORROR, Genre.DRAMA, Genre.ROMANCE, Genre.ADVENTURE, Genre.SATIRE, Genre.HORROR), numISBN of book!");


                    String[] values = sc.nextLine().split(", ");
                    String year = values[0];
                    String name = values[1];
                    String editionPath = values[2];
                    String author = values[3];
                    String genre = values[4];
                    String ISBN = values[5];

                    library.addBook(year, name, author, editionPath, Genre.valueOf(genre), ISBN);
                    System.out.println("Success! The book is added)");

                } else if (chosen == 2) {
                    System.out.println("enter year, name, path, author, dateOfEdit(yyyy-mm-dd), serialNumber of Magazine!");

                    String[] values = sc.nextLine().split(", ");
                    String year = values[0];
                    String name = values[1];
                    String editionPath = values[2];
                    String author = values[3];
                    String dateOfEdit = values[4];
                    String serialNumber = values[5];

                    library.addMagazine(year, name, author, editionPath, LocalDate.parse(dateOfEdit), serialNumber);
                    System.out.println("Success! The book is added)");

                } else if (chosen == 3) {
                    System.out.println("please, enter name, author or year (name, null, null)");

                    String[] values = sc.nextLine().split(", ");
                    String name = values[0].equals("null") ? null : values[0];
                    String author = values[1].equals("null") ? null : values[1];
                    String year = values[2].equals("null") ? null : values[2];
                    library.search(name, author, year).forEach(System.out::println);

                } else if (chosen == 4) {
                    System.out.println("enter a path!");
                    library.writeToLib(sc.nextLine());

                } else if (chosen == 5) {
                    System.out.println("please, enter a path!");
                    System.out.println(library.readContent(sc.nextLine()));

                } else if (chosen == 6) {
                    System.out.println("please, enter a path!");
                    library.downloadLib(sc.nextLine());

                } else if (chosen > 6) {
                    System.out.println("Not an option! Try again!)");

                }
                System.out.println("choose youre option: ");
                System.out.println("1. add book");
                System.out.println("2. add magazine");
                System.out.println("3. search");
                System.out.println("4. write to library");
                System.out.println("5. read content");
                System.out.println("6. download liibrary");
                System.out.println("0. exit");

                chosen = Integer.parseInt(sc.nextLine());

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
