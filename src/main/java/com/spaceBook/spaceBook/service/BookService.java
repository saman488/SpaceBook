package com.spaceBook.spaceBook.service;

import com.spaceBook.spaceBook.entity.Book;
import com.spaceBook.spaceBook.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public void save(Book book){
        bookRepository.save(book);

    }
    public List<Book>getAllBooks(){
        return bookRepository.findAll();
    }
    public Book getBookId(int id){
        return bookRepository.findById(id).get();
    }
}
