package com.example.Springh2Database.controller;

import com.example.Springh2Database.model.Books;
import com.example.Springh2Database.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Books saveBook(@RequestBody Books books){
        return bookService.addBook(books);
    }

    @GetMapping
    public List<Books> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Books getUserById(@PathVariable int id) {
        return bookService.getById(id);
    }

    @PutMapping("/{id}")
    public Books updateUser(@PathVariable int id, @RequestBody Books books) {
        return bookService.update(id, books);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        return bookService.delete(id);
    }
}
