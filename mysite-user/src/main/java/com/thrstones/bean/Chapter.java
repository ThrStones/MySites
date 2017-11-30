package com.thrstones.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Administrator on 2017/11/16.
 */
@Entity
@Table(name = "readNovel_chapter")
public class Chapter extends Base {

    private String href;
    private String content;
    private String serial_number;
    private String novelId;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public String getNovelId() {
        return novelId;
    }

    public void setNovelId(String novelId) {
        this.novelId = novelId;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "href='" + href + '\'' +
                ", content='" + content + '\'' +
                ", serial_number='" + serial_number + '\'' +
                ", novelId='" + novelId + '\'' +
                "} " + super.toString();
    }
}