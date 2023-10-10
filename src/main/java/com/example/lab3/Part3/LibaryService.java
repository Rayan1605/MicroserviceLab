package com.example.lab3.Part3;

import java.util.ArrayList;
import java.util.List;

public class LibaryService {
    List<Book> book = new ArrayList<>();

    public void addBook(Book book){
        this.book.add(book);
    }

    public ArrayList<Book> books(){
        return (ArrayList<Book>) this.book;
    }
}
