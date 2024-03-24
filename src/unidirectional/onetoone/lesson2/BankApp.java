/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 28/02/2024
 * Time : 14:46
 * Project Name : unidirectional.onetoone.lesson2
 */
package unidirectional.onetoone.lesson2;

import unidirectional.onetoone.lesson2.model.Customer;

public class BankApp {
    public static void main(String[] args) {
        Customer customer = new Customer("Anna","AC-001");
//        Account account = new Account(); // this not possible because the constructor is package private (1 - 1)
        System.out.println(customer);
    }
}
