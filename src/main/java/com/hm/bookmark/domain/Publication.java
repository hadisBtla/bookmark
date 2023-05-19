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
public class Publication {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String pubName;
  private String pubAddress;

  private String pubPhone;
  @OneToMany private List<Book> books;
}
