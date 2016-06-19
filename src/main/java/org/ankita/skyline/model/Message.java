package org.ankita.skyline.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

    private int id ;
    private String message;
    private String author;
    private String created;

    //Need a no-arg constructor,
    public Message (){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }


}