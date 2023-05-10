package com.hm.bookmark.repository;

import com.hm.bookmark.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,String> {
}
