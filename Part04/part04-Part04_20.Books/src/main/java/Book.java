/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brend
 */
public class Book {
    private String title;
    private int pages;
    private int publicationYear;
    
    public Book (String providedTitle, int providedPages, int providedPublicationYear) {
        title = providedTitle;
        pages = providedPages;
        publicationYear = providedPublicationYear;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String toString() {
        return title + ", " + pages + " pages, " + publicationYear;
    }
}
