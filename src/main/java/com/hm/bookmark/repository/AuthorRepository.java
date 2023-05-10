package com.hm.bookmark.repository;

import com.hm.bookmark.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,String> {
}
