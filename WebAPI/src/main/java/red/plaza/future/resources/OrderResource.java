package red.plaza.future.resources;

import jakarta.inject.Singleton;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lombok.extern.slf4j.Slf4j;
import red.plaza.future.resources.representational.OrderState;

//import javax.ws.rs.GET;
//
//import javax.ws.rs.Path;
//import javax.ws.rs.core.Response;
//import javax.ws.rs.ext.Provider;

//import static javax.ws.rs.core.Response.Status.CREATED;

/**
 * Resource Order HTTP operation
 * <p>
 * //Note: 只有标记为jakarta.ws.rs.Path的才能被扫描到, javax.ws.rs.Path是不行的. 具体可以参考AnnotationAcceptingListener.
 * <p>
 * 这两个namespace的差别, 参考https://lists.jboss.org/archives/list/resteasy@lists.jboss.org/thread/ZCXCCH76MNZ7LS2LPX3HHIVSUUTMVNVJ/
 *
 * @see org.glassfish.jersey.server.internal.scanning.AnnotationAcceptingListener
 */


@Path(ResourceRegistry.RESOURCE_ORDER)
@Singleton
@Slf4j
public class OrderResource {

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response load(@PathParam("id") String orderId) {
        OrderState orderState = OrderState.builder().orderId(orderId).orderDesc("hello").build();
        log.info("--- {}", orderState);
        return Response.status(200).entity(orderState).build();
    }
}