/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 06/03/2024
 * Time : 18:33
 * Project Name : comparator
 */
package comparator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("a","a@com"));
        customers.add(new Customer("b","b@com"));

        customers.sort(new Customer("a","a@com"). new EmailComparator());
        System.out.println(customers);
    }
}
