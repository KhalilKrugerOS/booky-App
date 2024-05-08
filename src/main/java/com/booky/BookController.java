package com.booky;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/books")
@CrossOrigin(origins = "*")
public class BookController {
    @Autowired
    private libraryService libraryService;
    @GetMapping
    public ResponseEntity<List<Book>> AllBooks () {
        return new ResponseEntity<List<Book>>(libraryService.allBooks(),HttpStatus.OK);
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<Optional<Book>> getSingleBook (@PathVariable String bookId) {
        return new ResponseEntity<>(libraryService.singleBook(bookId), HttpStatus.OK);
    }
}
