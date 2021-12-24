package com.library.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.library.Entities.BookEntity;

import java.util.List;
@Dao
public interface BookDao {
    @Insert
    void insertBookEntity(BookEntity bk); //Add 1 seul object Book

    //Add une list dobject book
    @Insert
    void insertBookEntity(BookEntity...bookEntity);

    @Delete
    void deleteBookEntity(BookEntity bk);  // Delete 1 seul object

    //delete plusieurs object en mem temp
    @Delete
    void deleteBookEntity(BookEntity...bk);

    @Update
    void updateBookEntity(BookEntity bk);

    @Query("SELECT *FROM Book_Table ")
   LiveData<List<BookEntity>> getAllBookEntity();

    @Query("SELECT *FROM Book_Table where Book_Name  LIKE:name ")
    LiveData<List<BookEntity>> findBookEntity(String name);
}
