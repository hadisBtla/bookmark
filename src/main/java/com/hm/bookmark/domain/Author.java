package com.hm.bookmark.domain;

import com.hm.bookmark.enums.LifeStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.ZonedDateTime;
import java.util.List;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Author {
  private String name;
  private String family;
  private ZonedDateTime birthDate;
  private List<Book> books;

  private LifeStatus lifeStatus;
  private List<String> nickNames;
}
