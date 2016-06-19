package org.ankita.skyline.services;

import org.ankita.skyline.model.Message;
import java.util.List;
import java.util.ArrayList;

public class MessageService {

    public List<Message> getMessages(){

        Message message1 = new Message();
        message1.setId(1);
        message1.setMessage("How are you doing ?");
        message1.setAuthor("Joey");
        message1.setCreated("today");

        List<Message> messages = new ArrayList<>();
        messages.add(message1);

        return messages;
    }


}