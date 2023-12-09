package red.plaza.future.resources;

import jakarta.inject.Singleton;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

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
 * 这两个namespace的差别, 参考 https://lists.jboss.org/archives/list/resteasy@lists.jboss.org/thread/ZCXCCH76MNZ7LS2LPX3HHIVSUUTMVNVJ/
 *
 * @see org.glassfish.jersey.server.internal.scanning.AnnotationAcceptingListener
 */


@Path("/order")
@Singleton
public class OrderResource {

    @GET
    public Response order() {
        System.out.println("hello here is a order ");
        return Response.status(200).entity("hello order ")
                .build();
    }
}