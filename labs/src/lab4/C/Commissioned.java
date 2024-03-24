/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 03/03/2024
 * Time : 22:20
 * Project Name : lab4.C
 */
package lab4.C;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
    private double commission;
    private double baseSalary;


    List<Order> orders = new ArrayList<>();

    Commissioned(String empID, double commission, double baseSalary) {
        super(empID);
        this.commission = commission;
        this.baseSalary = baseSalary;
    }

    public void addOrders(Order order) {
        this.orders.add(order);
    }

    @Override
    public double calGrossPay(int month, int yr) {
        double orderAmount = 0.0;
        for (var order : orders) {
            orderAmount += order.getOrderAmount();
        }

        return 12 * (baseSalary + commission * orderAmount);
    }
}
