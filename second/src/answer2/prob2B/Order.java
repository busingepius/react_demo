/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 01/03/2024
 * Time : 08:48
 * Project Name : answer2.prob2B
 */
package answer2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNum;



    private List<OrderLine> orderLineList = new ArrayList<>();

    public Order(int orderNum){
        this.orderNum = orderNum;
        this.orderLineList.add(new OrderLine(this));
    }

    public void addOrderLine(Order order){
        this.orderLineList.add(new OrderLine(this));
    }
    public List<OrderLine> getOrderLine(){
        return orderLineList;
    }
}
