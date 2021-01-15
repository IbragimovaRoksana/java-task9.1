package ru.netology.domain;

import java.util.Date;

public class Post {
    int id;
    int ownerId;
    int fromId;
    int createdBy;
    Date time;
    String text;
    int replyOwnerId;
    int replyPostId;
    boolean friendsOnly;
    Comment comments;
    Copyright authorPost;
    Like likePost;
    Repost rePost;
    View view;
    String postType;
    PostSource postSource;
    Geo geolocation;
    int signerId;
    boolean canPin;
    boolean canDelete;
    boolean canEdit;
    int isPinned;
    boolean markedAsAds;
    boolean isFavorite;
    Donut donut;
    int postponedId;

}
