package com.example.lab3.Part3;

import com.example.lab3.Part2.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@AllArgsConstructor
public class LibaryController {

    LibaryService libary;

    @GetMapping("/getbooks")
    public ArrayList<Book> GETBOOK(){
        return libary.books();
    }

    @PostMapping("/registerBook")
    public void Register2(@RequestBody Book book){
     libary.addBook(book);
    }
}
