package com.hm.bookmark.domain;

import com.hm.bookmark.enums.Language;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.ZonedDateTime;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {

  @Id private String id;
  private String name;
  private String author; // TODO must be entity
  private Long totalPageNumber;
  private ZonedDateTime publishDate; // todo check name meaning
  private String genre; // todo must be enum
  private String translator; // todo must be entity
  private String publication; // todo must be entity
  private String description; // todo must be clob
  private String rangeDate;
  private Language language;
  private byte[] pictureBook;
}
