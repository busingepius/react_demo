/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 28/02/2024
 * Time : 14:41
 * Project Name : unidirectional.onetoone.lesson2.unidirectional.onetoone.lesson2.model
 */
package unidirectional.onetoone.lesson2.model;

import static java.lang.StringTemplate.STR;

public class Customer {
    private String name;
    private  Account account;

    public Customer(String name, String accountNo){
        this.name =name;
        this.account = new Account(accountNo);
    }

    @Override
    public String toString(){
        String classString  = STR."\{name}";
        return classString;
    }
}
