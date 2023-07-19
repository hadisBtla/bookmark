package com.hm.bookmark.resource;

import com.hm.bookmark.service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookmark/comment")
@AllArgsConstructor
public class CommentResource {

  private final CommentService commentService;

  @PostMapping("/v1/add-comment")
  public ResponseEntity.HeadersBuilder<?> addComment(@RequestBody String comment) {
    final String id = commentService.saveComment(comment);
    if (StringUtils.hasLength(id)) {

      return ResponseEntity.noContent();
    }
    return ResponseEntity.internalServerError();
  }

  @GetMapping("/v1/like/{commentId}")
  public ResponseEntity<Long> like(@PathVariable String commentId) {
    return ResponseEntity.ok(commentService.addLike(commentId));
  }

  @GetMapping("/v1/remove/{commentId}")
  public ResponseEntity removeComment(@PathVariable String commentId) {
    commentService.deleteComment(commentId);
    return ResponseEntity.noContent().build();
  }
}
