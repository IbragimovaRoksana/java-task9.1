package ru.netology.domain;

import java.util.Date;

public class Post {
    Vk postObject = new Vk();

    int postId;
    Date date = postObject.publicationDate;
    String postName;
    String postText;
    int authorId;
    String authorName;

}
