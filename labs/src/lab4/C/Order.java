/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 03/03/2024
 * Time : 22:17
 * Project Name : lab4.C
 */
package lab4.C;

import java.time.LocalDate;

public class Order {
    private int orderNo;
    private LocalDate orderDate;

    public double getOrderAmount() {
        return orderAmount;
    }

    private double orderAmount;

    private Commissioned owner;
    private Order(int orderNo, LocalDate orderDate, double orderAmount, Commissioned owner) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;this.owner =owner;
    }

    public static Order createOrder(int orderNo, LocalDate orderDate, double orderAmount, Commissioned owner){
       return new Order( orderNo,  orderDate,  orderAmount,  owner);
    }

}
