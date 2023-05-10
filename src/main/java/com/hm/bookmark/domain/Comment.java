package com.hm.bookmark.domain;

import java.util.List;

public class Comment {
    private String id;
    private String commentText;
    private List<Comment> replies;
    private Long likeCount;

}
