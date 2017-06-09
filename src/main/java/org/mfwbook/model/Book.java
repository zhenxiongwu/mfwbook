package org.mfwbook.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
// @NamedQuery(name="Person.withNameAndAddressNamedQuery",
// query="select p from Person p where p.name=?1 and address=?2")
public class Book {

    @Id
    private String bookId;
    private String bookName;
    private String author;
    private String publisher;
    private String bookTypes;
    private int readTimes;
    private int searchTimes;
    
/*    @JsonIgnore
    @ManyToMany(mappedBy="user")
    private Set<User> listUsers = new HashSet<>();*/
/*    @JsonIgnore
    @ManyToMany
    private User user;*/

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBookTypes() {
        return bookTypes;
    }

    public void setBookTypes(String bookTypes) {
        this.bookTypes = bookTypes;
    }

    public int getReadTimes() {
        return readTimes;
    }

    public void setReadTimes(int readTimes) {
        this.readTimes = readTimes;
    }

    public int getSearchTimes() {
        return searchTimes;
    }

    public void setSearchTimes(int searchTimes) {
        this.searchTimes = searchTimes;
    }

}