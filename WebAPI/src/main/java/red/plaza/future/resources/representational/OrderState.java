package red.plaza.future.resources.representational;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 *
 */
@Data
@Builder
@ToString
public class OrderState {

    public OrderState() {
    }

    public OrderState(String orderId, String orderDesc) {
        this.orderId = orderId;
        this.orderDesc = orderDesc;
    }

    private String orderId;

    private String orderDesc;
}
