package org.lessons.java;

import java.util.Scanner;

public class LibraryCatalog {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBooks;
        do {
            System.out.print("Inserisci il numero di libri da catalogare (deve essere un numero intero positivo): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Input non valido! Devi inserire un numero intero positivo.");
                scanner.next();
            }
            numberOfBooks = scanner.nextInt();
            scanner.nextLine();
        } while (numberOfBooks < 1);

        Book[] books = new Book[numberOfBooks];


        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("\nInserisci i dati del libro " + (i + 1) + ":");

            try {
                System.out.print("Titolo: ");
                String title = scanner.nextLine();

                // Controllo eccezione per il numero di pagine
                System.out.print("Numero di pagine: ");
                int numberOfPages = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Autore: ");
                String author = scanner.nextLine();

                System.out.print("Editore: ");
                String publisher = scanner.nextLine();

                Book book = new Book(title, numberOfPages, author, publisher);
                books[i] = book;
            } catch (Exception e) {
                System.out.println("Errore: " + e.getMessage());
                i--; // Ripeti l'inserimento del libro
            }
        }


        System.out.println("\nCatalogo di libri:");

        for (Book book : books) {
            System.out.println("Titolo: " + book.getTitle());
            System.out.println("Numero di pagine: " + book.getNumberOfPages());
            System.out.println("Autore: " + book.getAuthor());
            System.out.println("Editore: " + book.getPublisher());
            System.out.println();
        }
    }
}
