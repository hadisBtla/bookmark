package com.hm.bookmark.resource;

import com.hm.bookmark.domain.Book;
import com.hm.bookmark.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/bookmark/book")
public class BookResource {
    private final BookService bookService;

    @PostMapping("/v1/add-book")
    public ResponseEntity<String> addBook(@RequestBody Book book){
        String bookId = bookService.saveBook(book);
        return  ResponseEntity.ok(bookId);
    }


    @DeleteMapping("/v1/remove-book")
    public void removeBook(@RequestBody Book book){
        bookService.deleteBook(book);
    }



}
