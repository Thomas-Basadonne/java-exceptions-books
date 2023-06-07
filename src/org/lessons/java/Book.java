package org.lessons.java;


public class Book {
    private String title;
    private int numberOfPages;
    private String author;
    private String publisher;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws Exception {
        if (title.isEmpty()) {
            throw new Exception("Titolo non valido!");
        }
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) throws Exception {
        if (numberOfPages <= 0) {
            throw new Exception("Numero di pagine non valido!");
        }
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws Exception {
        if (author.isEmpty()) {
            throw new Exception("Autore non valido!");
        }
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) throws Exception {
        if (publisher.isEmpty()) {
            throw new Exception("Editore non valido!");
        }
        this.publisher = publisher;
    }
}