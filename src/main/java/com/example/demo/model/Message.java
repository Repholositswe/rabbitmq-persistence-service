package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Message {

    @Id
    private long id;
    private String content;
    private Date dateReceived;


    public Message() {
    }


    public Message(String content) {
        this.content = content;
    }


    public String getContent() {
        return content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Date dateReceived) {
        this.dateReceived = dateReceived;
    }
}