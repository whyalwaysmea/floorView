package com.ithaha.floorview;

/**
 * @author: Long
 * @Date: 2016/3/30 14:51
 * 评论
 */
public class Comment implements Commentable, Comparable {

    private String name;                // 评论者

    private String content;             // 评论的内容

    private int floorNum = 1;           // 楼层

    public Comment(String name, String content, int floorNum) {
        this.name = name;
        this.content = content;
        this.floorNum = floorNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    @Override
    public int getCommentFloorNum() {
        return getFloorNum();
    }

    @Override
    public String getCommentContent() {
        return getContent();
    }

    @Override
    public String getAuthorName() {
        return getName();
    }

    @Override
    public int compareTo(Object another) {
        Comment anotherComment = (Comment) another;
        return getFloorNum() - anotherComment.getFloorNum();
    }
}
