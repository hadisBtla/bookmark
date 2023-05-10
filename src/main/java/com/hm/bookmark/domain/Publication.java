package com.hm.bookmark.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Publication {
    @Id
    private String id;
    private String pubName;
    private String pubAddress;

    private String pubPhone;
    private List<Book> books;

}
