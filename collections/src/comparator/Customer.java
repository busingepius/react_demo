/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 06/03/2024
 * Time : 18:26
 * Project Name : comparator
 */
package comparator;


import java.util.Comparator;

public class Customer implements Comparable<Customer> {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        Customer customer = (Customer) o;
        return name.compareTo(customer.name);
    }


    class EmailComparator implements Comparator<Customer> {
        public int compare(Customer c1, Customer c2) {
            return c1.email.compareTo(c2.email);
        }

    }
}
