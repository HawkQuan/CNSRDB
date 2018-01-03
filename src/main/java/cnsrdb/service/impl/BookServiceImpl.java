package cnsrdb.service.impl;

import cnsrdb.mapper.BookMapper;
import cnsrdb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

}
