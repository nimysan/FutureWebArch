package red.plaza.future.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.ws.rs.core.Application;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.slf4j.bridge.SLF4JBridgeHandler;

import java.util.logging.LogManager;

public class OrderServiceTest extends JerseyTest {

    //forward jdk log to slf4j bridge
    static {
        LogManager.getLogManager().reset();
        SLF4JBridgeHandler.install();
    }

    private final static Logger LOG = LoggerFactory.getLogger(OrderServiceTest.class);


    @Override
    protected Application configure() {
        LOG.info("Configure the Jersey Test");
        return new ResourceConfig(OrderResource.class);
    }

    @Test
    public void ordersPathParamTest() {
        String response = target("order").request().get(String.class);
        Assertions.assertEquals("hello order ", response);
        LOG.info("ordersPathParamTest the Jersey Test");
    }

}