package com.example.nyt.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface BookDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertBook(Book... book);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertBooks(List<Book> books);

    @Query("SELECT * FROM book")
    public List<Book> getAllBooks();

    @Query("SELECT * FROM book ORDER BY rank ASC")
    public List<Book> getAllBooksSorted();

    @Query("SELECT * FROM book WHERE isbn = :isbnVar")
    public Book findBookByIsbn(long isbnVar);

    @Delete
    void delete(Book book);
}
