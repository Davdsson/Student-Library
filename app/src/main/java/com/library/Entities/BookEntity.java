package com.library.Entities;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.jetbrains.annotations.NonNls;

@Entity(tableName = "Book_Table")
public class BookEntity {
    @PrimaryKey(autoGenerate = true)
    @NonNls
    @ColumnInfo(name = "Book_Id")
    int b_id;
    @NonNls
    @ColumnInfo(name="Book_Name")
    String b_name;
    @NonNls
    @ColumnInfo(name ="Book_Author")
    String b_author;
    @NonNls
    @ColumnInfo(name = "Book_Detail")
    String b_detail;
    /*public BookEntity(int b_id, String b_name, String b_author, String b_detail) {
        this.b_id = b_id;
        this.b_name = b_name;
        this.b_author = b_author;
        this.b_detail = b_detail;
    }

     */


    public BookEntity(String b_name, String b_author, String b_detail) {
        this.b_name = b_name;
        this.b_author = b_author;
        this.b_detail = b_detail;
    }

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getB_author() {
        return b_author;
    }

    public void setB_author(String b_author) {
        this.b_author = b_author;
    }

    public String getB_detail() {
        return b_detail;
    }

    public void setB_detail(String b_detail) {
        this.b_detail = b_detail;
    }

}
