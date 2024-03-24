/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 03/03/2024
 * Time : 21:58
 * Project Name : lab4.C
 */
package lab4.C;

import static java.lang.StringTemplate.STR;

public abstract class Employee {
    private String empID;

     Employee(String empID) {
        this.empID = empID;
    }

    public void print() {
        System.out.println(STR."Employee with ID: \{empID}");
    }

    public  Paycheck calcCompensation(int month, int year){
        return new Paycheck(calGrossPay(month,year));
    }

    public abstract double calGrossPay(int month, int yr);
}
