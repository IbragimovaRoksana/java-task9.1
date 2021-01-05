package ru.netology.domain;

import java.util.Date;

public class Vk {

    int id;
    int idGroup;
    String nameGroup;
    Date publicationDate = new Date();
    String namePublication;
    Post referencePost = new Post();
    String referenceAddress;
    boolean buttonReadPublication;
    int likeInfo;
    int commentsInfo;
    int repostInfo;
    int viewInfo;

}
