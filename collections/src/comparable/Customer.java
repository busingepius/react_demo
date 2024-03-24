package comparable;

import java.util.Comparator;

/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 06/03/2024
 * Time : 12:16
 * Project Name : PACKAGE_NAME
 */

//public class Customer implements Comparable<Object> {
//    public String getName() {
//        return name;
//    }
//
//    private String name;
//    public Customer(String name){
//        this.name = name;
//    }
//
//    @Override
//    public int compareTo(Object o) {
//        Customer customer = (Customer) o;
//        return name.compareTo(customer.name);
//    }
//
//    @Override
//    public String toString() {
//        return "comapring.Customer{" +
//                "name='" + name + '\'' +
//                '}';
//    }
//}

public class Customer implements Comparable<Customer>,Comparator<Customer> {
    public String getName() {
        return name;
    }

    private String name;
    public Customer(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Customer o) {
        Customer customer = (Customer) o;
        return name.compareTo(customer.name);
    }

    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.compareTo(o2);
    }

    @Override
    public String toString() {
        return "comapring.Customer{" +
                "name='" + name + '\'' +
                '}';
    }
}
