/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 03/03/2024
 * Time : 21:28
 * Project Name : lab4.C
 */
package lab4.C;

final public class Paycheck {
    final private double fica = 0.23;
    final private double state = 0.05;
    final private double local = 0.01;
    final private double medicare = 0.03;
    final private double socialSecurity = 0.075;
    final private double grossPay;

    public Paycheck(double grossPay) {
        this.grossPay = grossPay;
    }

    public void print() {
        System.out.println("Paycheck day");
    }

    public double getNetPay() {
        return grossPay - (
                (grossPay * fica) +
                        (grossPay * state) +
                        (grossPay * local) +
                        (grossPay * medicare) +
                        (grossPay * socialSecurity)
        );
    }
}
