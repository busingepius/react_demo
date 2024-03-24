/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 03/03/2024
 * Time : 22:06
 * Project Name : lab4.C
 */
package lab4.C;

public class Hourly extends Employee {
    private double hourlyWage;
    private double hoursPerWeek;

    public Hourly(String empID, double hourlyWage, double hoursPerWeek) {
        super(empID);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calGrossPay(int month, int yr) {
        return 12 * (hourlyWage * hoursPerWeek * 4);
    }
}
