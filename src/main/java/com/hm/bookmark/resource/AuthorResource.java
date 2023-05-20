package com.hm.bookmark.resource;

import com.hm.bookmark.domain.Author;
import com.hm.bookmark.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RequestMapping("/bookmark/author")
@RestController
public class AuthorResource {
    private final AuthorService authorService;


    @PostMapping("/v1/add-author")
    public ResponseEntity<Long> addAuthor(@RequestBody Author author){
        Long authorId = authorService.saveAuthor(author);
        return ResponseEntity.ok(authorId);
    }

}
