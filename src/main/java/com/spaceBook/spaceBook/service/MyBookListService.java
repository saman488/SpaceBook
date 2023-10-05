package com.spaceBook.spaceBook.service;

import com.spaceBook.spaceBook.entity.MyBookList;
import com.spaceBook.spaceBook.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.xpath.XPathEvaluationResult;
import java.util.List;

@Service
public class MyBookListService {
    @Autowired
    private MyBookRepository myBookRepository;
    public void saveMyBook(MyBookList myBookList){
        myBookRepository.save(myBookList);

    }
    public List<MyBookList> getAllMyBooks(){
        return myBookRepository.findAll();
    }
}
