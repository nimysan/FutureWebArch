package red.plaza.future.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.ws.rs.core.Application;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.jupiter.api.Test;

import org.slf4j.bridge.SLF4JBridgeHandler;
import red.plaza.future.resources.representational.OrderState;

import java.util.logging.LogManager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static red.plaza.future.resources.ResourceRegistry.RESOURCE_ORDER;

/**
 * Test Restful actions behavior
 */
public class OrderServiceTest extends JerseyTest {
    private final static Logger LOG = LoggerFactory.getLogger(OrderServiceTest.class);

    //forward jdk log to slf4j bridge
    static {
        LogManager.getLogManager().reset();
        SLF4JBridgeHandler.install();
    }

    @Override
    protected Application configure() {
        LOG.info("Configure the Jersey Test");
        return new ResourceConfig(OrderResource.class);
    }

    @Test
    public void verifyLoad() {
        String orderId = "123";
        OrderState response = target(RESOURCE_ORDER + "/" + orderId).request().get(OrderState.class);
        assertEquals(orderId, response.getOrderId());
        LOG.info("ordersPathParamTest the Jersey Test");
    }

    @Test
    public void verifyCreate() {
        String response = target(RESOURCE_ORDER).request().get(String.class);
        assertEquals("hello order ", response);
        LOG.info("ordersPathParamTest the Jersey Test");
    }

    @Test
    public void verifyUpdate() {
        String response = target(RESOURCE_ORDER).request().get(String.class);
        assertEquals("hello order ", response);
        LOG.info("ordersPathParamTest the Jersey Test");
    }

    @Test
    public void verifyDelete() {
        String response = target(RESOURCE_ORDER).request().get(String.class);
        assertEquals("hello order ", response);
        LOG.info("ordersPathParamTest the Jersey Test");
    }

}