package red.plaza.future;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.servlet.GrizzlyWebContainerFactory;
import org.glassfish.jersey.server.ServerProperties;

import javax.ws.rs.ApplicationPath;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AppWithGrizzly {
    public static void main(String[] args) throws IOException {
//        String path = AppWithGrizzly.class.getClassLoader()
//                .getResource("jul-log.properties")
//                .getFile();
//        System.setProperty("java.util.logging.config.file", path);


        System.out.println("Starting Thumb Server...");
        Map<String, String> initParams = new HashMap<String, String>();
        //参数设置估计要参考这个 https://eclipse-ee4j.github.io/jersey.github.io/documentation/2.29/appendix-properties.html
        /*
         * Resource Order HTTP operation
         * <p>
         * //Note: 只有标记为jakarta.ws.rs.Path的才能被扫描到, javax.ws.rs.Path是不行的. 具体可以参考AnnotationAcceptingListener.
         * <p>
         * 这两个namespace的差别, 参考 https://lists.jboss.org/archives/list/resteasy@lists.jboss.org/thread/ZCXCCH76MNZ7LS2LPX3HHIVSUUTMVNVJ/
         *
         * @see org.glassfish.jersey.server.internal.scanning.AnnotationAcceptingListener
         */
        initParams.put(ServerProperties.PROVIDER_PACKAGES, "red.plaza.future.resources");

        HttpServer httpServer =
                GrizzlyWebContainerFactory.create("http://localhost:9998/test/", initParams);


        httpServer.start();
    }
}