package com.booky;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface BookRepository extends MongoRepository<Book, ObjectId> {
    Optional<Book> findBookBybookId(String bookId);

}
