package com.hm.bookmark.service;

import com.hm.bookmark.domain.Book;
import com.hm.bookmark.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public String saveBook(Book book){
        return bookRepository.save(book).getId();
    }

    public void deleteBook(Book book){
         bookRepository.delete(book);
    }

}
