package com.hm.bookmark.domain;

import com.hm.bookmark.enums.LifeStatus;

import java.time.ZonedDateTime;
import java.util.List;

public class Author {
    private String name;
    private String family;
    private ZonedDateTime birthDate;
    private List<Book> books;

    private LifeStatus lifeStatus;
    private List<String> nickNames;
}
