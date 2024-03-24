/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 04/03/2024
 * Time : 06:02
 * Project Name : lab4.E.startup
 */
package lab4.E.startup;

public class CheckingAccount extends Account{
    private double balance;
    private double monthlyFee;
    private String acctId;

    public CheckingAccount(String acctId, double fee, double startBalance){
        this.acctId = acctId;
        this.monthlyFee = fee ;
        this.balance = startBalance;
    }
    @Override
    public String getAccountID() {
        return acctId;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double computeUpdatedBalance() {
        return (balance - monthlyFee);
    }
}
