package com.example.zad9;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.util.List;

@Entity(tableName = "book")
public class Book {
//    @PrimaryKey(autoGenerate = true)
//    private int id;
    @SerializedName("title")
    private String title;
    @SerializedName("author_name")
    private List<String> authors;
    @SerializedName("cover_i")
    private String cover;
    @SerializedName("number_of_pages_median")
    private String numberOfPages;

//    public Book (String title, String author) {
//        this.title = title;
//        this.author = author;
//    }

//    public int getId() { return id; }
//
//    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public List<String> getAuthors() { return authors; }

    public void setAuthors(List<String> authors) { this.authors = authors; }

    public String getCover() { return cover; }

    public void setCover(String cover) { this.cover = cover; }

    public String getNumberOfPages() { return numberOfPages; }

    public void setNumberOfPages(String numberOfPages) { this.numberOfPages = numberOfPages; }
}
