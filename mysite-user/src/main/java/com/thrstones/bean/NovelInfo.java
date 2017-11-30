package com.thrstones.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Administrator on 2017/11/16.
 */
@Entity
@Table(name = "readNovel_novelinfo")
public class NovelInfo extends Base {

    private String avatar;
    private String author;
    private String category;
    private String state;
    private int words;
    private String latest_updatetime;
    private String latest_chapter;
    private String website;
    private String novelId;
    private String intro;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getWords() {
        return words;
    }

    public void setWords(int words) {
        this.words = words;
    }

    public String getLatest_updatetime() {
        return latest_updatetime;
    }

    public void setLatest_updatetime(String latest_updatetime) {
        this.latest_updatetime = latest_updatetime;
    }

    public String getLatest_chapter() {
        return latest_chapter;
    }

    public void setLatest_chapter(String latest_chapter) {
        this.latest_chapter = latest_chapter;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getNovelId() {
        return novelId;
    }

    public void setNovelId(String novelId) {
        this.novelId = novelId;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Override
    public String toString() {
        return "NovelInfo{" +
                "avatar='" + avatar + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", state='" + state + '\'' +
                ", words=" + words +
                ", latest_updatetime='" + latest_updatetime + '\'' +
                ", latest_chapter='" + latest_chapter + '\'' +
                ", website='" + website + '\'' +
                ", novelId='" + novelId + '\'' +
                ", intro='" + intro + '\'' +
                "} " + super.toString();
    }
}