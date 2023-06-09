package com.hm.bookmark.domain;

import com.hm.bookmark.enums.Language;

import java.time.ZonedDateTime;

@Data
@Entity
@Table
public class Book {

    private String id;
    private String name;
    private String author; //TODO must be entity
    private Long totalPageNumber;
    private ZonedDateTime publishDate; //todo check name meaning
    private String genre; //todo must be enum
    private String translator; //todo must be entity
    private String publication; //todo must be entity
    private String description; //todo must be clob
    private String rangeDate;
    private Language language;
    private byte[] pictureBook;
}
