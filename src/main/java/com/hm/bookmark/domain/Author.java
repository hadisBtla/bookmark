package com.hm.bookmark.domain;

import com.hm.bookmark.enums.LifeStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.List;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Author {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;
  private String family;
  private ZonedDateTime birthDate;
  @OneToMany private List<Book> books;

  private LifeStatus lifeStatus;
  private String nickNames;
}
