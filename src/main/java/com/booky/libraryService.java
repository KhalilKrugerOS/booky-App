package com.booky;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class libraryService {
    @Autowired
    private BookRepository bookRepository;
    public List<Book> allBooks () {
        return bookRepository.findAll();
    }

    public Optional<Book> singleBook (String bookId) {
        return bookRepository.findBookBybookId(bookId);
    }
}
