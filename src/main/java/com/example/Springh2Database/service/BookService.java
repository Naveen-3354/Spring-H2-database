package com.example.Springh2Database.service;

import com.example.Springh2Database.dao.BooksRepository;
import com.example.Springh2Database.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BooksRepository booksRepository;

    public Books addBook(Books books){
        return booksRepository.save(books);
    }

    public List<Books> getAllBooks(){
        return booksRepository.findAll();
    }

    public Books getById(int id){
        return booksRepository.findById(id).get();
    }

    public Books update(int id, Books books){
        Books myBooks= booksRepository.findById(id).get();
        myBooks.setBookName(books.getBookName());
        myBooks.setAuthor(books.getAuthor());
        myBooks.setGenre(books.getGenre());
        myBooks.setYear(books.getYear());
        myBooks.setPublished(books.isPublished());
        return booksRepository.save(myBooks);
    }

    public String delete(int id) {
        booksRepository.deleteById(id);
        return "Book delete.";
    }
}
