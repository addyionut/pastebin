package com.clone.pastebin;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
public class Pastebin {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String pasteName;
    private String content;
    private LocalDate pasteDate;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPasteName() {
        return pasteName;
    }

    public void setPasteName(String pasteName) {
        this.pasteName = pasteName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getPasteDate() {
        return pasteDate;
    }

    public void setPasteDate(LocalDate pasteDate) {
        this.pasteDate = pasteDate;
    }
}
