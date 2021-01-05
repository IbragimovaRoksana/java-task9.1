package ru.netology.domain;

import java.util.Date;

public class Vk {

    int id;
    int idGroup;
    String nameGroup;
    Date publicationDate = new Date();
    String namePublication;
    String text;
    int replyOwnerId;
    int replyPostId;
    boolean friendsOnly;
    Post referencePost = new Post();
    String referenceAddress;
    boolean buttonReadPublication;
    boolean userLikes, canLike, canPublish;
    int quantityLikeInfo;
    boolean canComment, groupCanPost, canClose, canOpen;
    boolean haveSomeComment;
    int quantityCommentsInfo;
    boolean openComments;
    Comment comment = new Comment();
    String author = comment.nameCommentator;
    String pageAuthor = comment.referencePageAuthor;
    String firstComment = comment.textComment;
    Date dateComment = comment.commentDate;
    int referenciesAuthor = comment.quantityRepostComment;
    int likesComment = comment.quantityLikesComment;
    boolean haveSomeRepost;
    boolean userReposted;
    String postType;
    int quantityRepostInfo;
    int quantityViewInfo;
    Geo geo = new Geo();
    RootRulesUser rule = new RootRulesUser();
    Donat donat = new Donat();
    int postponedId;
}
