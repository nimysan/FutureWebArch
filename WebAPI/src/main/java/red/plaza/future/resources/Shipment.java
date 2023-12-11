package red.plaza.future.resources;

import jakarta.inject.Singleton;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lombok.extern.slf4j.Slf4j;
import red.plaza.future.resources.representational.OrderState;

@Slf4j
@Singleton
public class Shipment {
    @PUT
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response load(@PathParam("id") String orderId) {
        OrderState orderState = OrderState.builder().orderId(orderId).orderDesc("hello").build();
        log.info("--- {}", orderState);
        return Response.status(200).entity(orderState).build();
    }
}
