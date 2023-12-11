package red.plaza.future.resources;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.core.Response;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Path;

@Path("/test")
public class TestResource {
    @GET
    public Response order() {
//        System.out.println("hello here is test resource ");
        return Response.status(200).entity("123")
                .build();
    }
}
