package lab4.E.startup;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double updatedBalanceSum = 0.0;
		for (Employee employee : list) {
			updatedBalanceSum += employee.computeUpdatedBalanceSum();
		}
		return updatedBalanceSum;
	}
}
