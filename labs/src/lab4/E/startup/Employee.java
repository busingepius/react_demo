package lab4.E.startup;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Employee(String name) {
        this.name = name;
    }

    public double computeUpdatedBalanceSum() {
        double updatedBalanceSum = 0.0;
        for (Account account : accounts) {
            updatedBalanceSum += account.computeUpdatedBalance();
        }
        return updatedBalanceSum;
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }
}
