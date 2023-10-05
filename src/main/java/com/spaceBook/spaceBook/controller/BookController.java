package com.spaceBook.spaceBook.controller;

import com.spaceBook.spaceBook.entity.Book;
import com.spaceBook.spaceBook.entity.MyBookList;
import com.spaceBook.spaceBook.repository.MyBookRepository;
import com.spaceBook.spaceBook.service.BookService;
import com.spaceBook.spaceBook.service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.lang.model.element.NestingKind;
import java.util.*;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private MyBookListService myBookListService;
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/book_register")
    public String bookRegister(){
        return "bookRegister";
    }
    @GetMapping("/available_books")
    public ModelAndView getAllBook(){
        List<Book>list=bookService.getAllBooks();
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("bookList");
//        modelAndView.addObject("book",list);
        return new ModelAndView("bookList","book",list );
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book book){
        bookService.save(book);
        return "redirect:/available_books";
    }
    @GetMapping("/my_books")
    public String getMyBooks(Model model){

        List<MyBookList> list= myBookListService.getAllMyBooks();
        model.getAttribute("book");
        return "myBooks";
    }
    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") int id){
        Book book = bookService.getBookId(id);
        MyBookList myBookList = new MyBookList(book.getId(),book.getName(), book.getAuthor(),book.getPrice());
        myBookListService.saveMyBook(myBookList);
        return "redirect:/my_books";
    }

}
