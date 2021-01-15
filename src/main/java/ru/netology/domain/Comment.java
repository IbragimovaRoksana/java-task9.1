package ru.netology.domain;

import java.util.Date;

public class Comment {

    int countOfComments;
    Copyright authorComment;
    String textComment;
    Date commentDate;
    Like likeComment;
    Repost repostComment;
    boolean canPost;
    boolean groupsCanPost;
    boolean canClose;
    boolean canOpen;

}
