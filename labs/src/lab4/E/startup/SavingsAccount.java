/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 04/03/2024
 * Time : 06:07
 * Project Name : lab4.E.startup
 */
package lab4.E.startup;

public class SavingsAccount extends  Account{
    private double balance;
    private double interestRate;
    private String acctID;

    public SavingsAccount(String acctID,double interestRate,double startBalance){
        this.acctID = acctID;
        this.interestRate = interestRate;
        this.balance = startBalance;
    }
    @Override
    public String getAccountID() {
        return acctID;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double computeUpdatedBalance() {
        return (balance + (interestRate * balance));
    }
}
