/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 01/03/2024
 * Time : 08:51
 * Project Name : answer2.prob2B
 */
package answer2.prob2B;

public class OrderLine {
    public Order getOwner() {
        return owner;
    }

    private Order owner;

    OrderLine(Order owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "OrderLine{" +

                '}';
    }
}
