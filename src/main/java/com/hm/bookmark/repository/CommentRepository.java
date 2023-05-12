package com.hm.bookmark.repository;

import com.hm.bookmark.domain.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment,String> {
}
