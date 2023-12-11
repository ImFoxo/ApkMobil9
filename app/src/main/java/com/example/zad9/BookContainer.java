package com.example.zad9;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BookContainer {
    @SerializedName("docs")
    private List<Book> bookList;

    public List<Book> getBookList() { return bookList; }

    public void setBookList(List<Book> bookList) { this.bookList = bookList; }
}
