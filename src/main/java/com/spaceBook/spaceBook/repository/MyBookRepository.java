package com.spaceBook.spaceBook.repository;

import com.spaceBook.spaceBook.entity.MyBookList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MyBookRepository extends JpaRepository<MyBookList, Integer> {

}
