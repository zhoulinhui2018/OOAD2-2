package xmu.oomall.domain.goods;

import xmu.oomall.domain.Payment;
import xmu.oomall.domain.order.Order;

import java.util.List;

/**
 * 活动付款策略
 * @author: Ming Qiu
 * @date: Created in 14:21 2019/11/26
 **/
public interface AbstractPaymentStrategy {
    List<Payment> getPayment(Order order);
}
