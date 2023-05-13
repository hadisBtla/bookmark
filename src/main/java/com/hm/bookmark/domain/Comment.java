package com.hm.bookmark.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comment {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private String id;

  private String commentText;
  @OneToMany private List<Comment> replies;
  private Long likeCount;
  private String commentOwner;
}
