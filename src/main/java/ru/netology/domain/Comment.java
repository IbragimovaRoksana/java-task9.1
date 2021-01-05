package ru.netology.domain;

import java.util.Date;

public class Comment {

    int countOfComments;
    int idCommentator;
    String nameCommentator;
    String referencePageAuthor;
    String textComment;
    Date commentDate = new Date();
    int quantityLikesComment;
    int quantityRepostComment;

}
