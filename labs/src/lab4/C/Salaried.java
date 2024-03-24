/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 03/03/2024
 * Time : 22:15
 * Project Name : lab4.C
 */
package lab4.C;

public class Salaried extends Employee{
    private double salary;
    public Salaried(String empID,double salary) {
        super(empID);
        this.salary = salary;
    }

    @Override
    public double calGrossPay(int month, int yr) {
        return 12*salary;
    }
}
