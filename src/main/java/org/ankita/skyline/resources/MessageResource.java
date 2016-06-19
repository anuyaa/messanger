package org.ankita.skyline.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ankita.skyline.model.Message;
import org.ankita.skyline.services.MessageService;

import java.util.List;


/**
 * Root resource (exposed at "messages" path)
 */
@Path("messages")
public class MessageResource {


    MessageService service = new MessageService();
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessages() {

         return service.getMessages();
    }
}
