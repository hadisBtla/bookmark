package com.hm.bookmark.service;

import com.hm.bookmark.domain.Comment;
import com.hm.bookmark.repository.CommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CommentService {

  private final CommentRepository repository;

  public String saveComment(String comment) {
    final Comment commentEntity =
        Comment.builder()
            .commentOwner("0015338436" /*TODO must get ssn from security context*/)
            .commentText(comment)
            .build();
    return repository.save(commentEntity).getId();
  }
}
