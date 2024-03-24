package comparable;

import java.util.*;
import java.util.function.Consumer;

/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 06/03/2024
 * Time : 12:24
 * Project Name : PACKAGE_NAME
 */

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("a"));
        customers.add(new Customer("b"));
        customers.add(new Customer("c"));

        for(Customer customer: customers){
            customer.compareTo(new Customer("pius"));
        }

        customers.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        System.out.println(customers);

        Collections.sort(customers,Collections.reverseOrder());


        customers.forEach(
                new Consumer<Customer>() {
                    @Override
                    public void accept(Customer customer) {
                        System.out.println(customer.getName());
                    }
                }
        );
    }
}
