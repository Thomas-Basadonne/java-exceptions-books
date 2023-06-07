package org.lessons.java;


public class Book {
    private String title;
    private int numberOfPages;
    private String author;
    private String publisher;

    public Book(String title, int numberOfPages, String author, String publisher) throws Exception {
        if (title.isEmpty()) {
            throw new Exception("Titolo non valido!");
        }
        this.title = title;

        if (numberOfPages <= 0) {
            throw new Exception("Numero di pagine non valido!");
        }
        this.numberOfPages = numberOfPages;

        if (author.isEmpty()) {
            throw new Exception("Autore non valido!");
        }
        this.author = author;

        if (publisher.isEmpty()) {
            throw new Exception("Editore non valido!");
        }
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }
}
