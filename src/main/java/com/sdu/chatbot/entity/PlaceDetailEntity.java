package com.sdu.chatbot.entity;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "place_detail", schema = "sduchatbot", catalog = "")
public class PlaceDetailEntity {
    private long id;
    private String contents;
    private byte[] pictures;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "contents")
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Basic
    @Column(name = "pictures")
    public byte[] getPictures() {
        return pictures;
    }

    public void setPictures(byte[] pictures) {
        this.pictures = pictures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlaceDetailEntity that = (PlaceDetailEntity) o;

        if (id != that.id) return false;
        if (contents != null ? !contents.equals(that.contents) : that.contents != null) return false;
        if (!Arrays.equals(pictures, that.pictures)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (contents != null ? contents.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(pictures);
        return result;
    }
}
