package com.example.nyt.model;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.util.List;

@Entity
public class Book {

    // ISBN can be our ID for books (we use isbn13 instead of isbn10)
    @PrimaryKey
    @SerializedName("primary_isbn13")
    private long isbn;

    private int rank;
    private String description;

    private String title;
    private String author;

    @SerializedName("book_image")
    private String bookImage;

    @Ignore
    @SerializedName("buy_links")
    private List<BuyLink> buyLinks;


    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
    public long getIsbn() {
        return isbn;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    public int getRank() {
        return rank;
    }


    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setBookImage(String bookImage) {
        this.bookImage = bookImage;
    }

    public String getBookImage() {
        return bookImage;
    }

    public void setBuyLinks(List<BuyLink> buyLinks) {
        this.buyLinks = buyLinks;
    }

    public List<BuyLink> getBuyLinks() {
        return buyLinks;
    }

    // Here I decide to write BuyLink as an inner class rather than in a separate file, because
    // it's very unlikely that BuyLink will be important anywhere else. It will always be part of a
    // book, and only part of a book.
    public class BuyLink {
        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public String getUrl() {
            return url;
        }
    }
}