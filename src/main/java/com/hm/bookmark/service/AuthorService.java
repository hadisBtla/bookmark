package com.hm.bookmark.service;

import com.hm.bookmark.domain.Author;
import com.hm.bookmark.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthorService {
    private final AuthorRepository authorRepository;

    public Long saveAuthor(Author author){
        return authorRepository.save(author).getId();
    }

    public void deleteAuthor(Author author){
        authorRepository.delete(author);
    }
}
