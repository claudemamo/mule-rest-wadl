package org.ossandme;

import javax.ws.rs.*;

@Path("/{userid}/comments/{title}/feed")
public interface CommentResource {

    @GET
    public String retrieveComment(@PathParam("userid") String userID, @PathParam("title") String title);

    @PUT
    public String createComment(@PathParam("userid") String userID, @PathParam("title") String title);

    @POST
    public String updateComment(@PathParam("userid") String userID, @PathParam("title") String title);

    @DELETE
    public String deleteComment(@PathParam("userid") String userID, @PathParam("title") String title);

}
