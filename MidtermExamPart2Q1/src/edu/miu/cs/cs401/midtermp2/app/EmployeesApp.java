/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 05/03/2024
 * Time : 11:16
 * Project Name : edu.miu.cs.cs401.midtermp2.app.model
 */
package edu.miu.cs.cs401.midtermp2.app;

import edu.miu.cs.cs401.midtermp2.app.model.Employee;

import java.time.LocalDate;

public class EmployeesApp {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(
                        1,
                        "EX1089",
                        "Daniel",
                        "Agar",
                        105945.50,
                        LocalDate.of(2022, 1, 17),
                        LocalDate.of(2023, 9, 13),
                        100.00
                ),
                new Employee(
                        2,
                        "SM1104",
                        "Benard",
                        "Shaw",
                        197750.00,
                        LocalDate.of(2023, 2, 20),
                        LocalDate.of(2023, 9, 21),
                        950.00
                ),
                new Employee(
                        3,
                        "SM2307",
                        "Carly",
                        "DeFiori",
                        842000.75,
                        LocalDate.of(2020, 5, 16),
                        LocalDate.of(2023, 11, 04),
                        1555.50
                ),
                new Employee(
                        4,
                        "SM4133",
                        "Wesley",
                        "Schneider",
                        74500.00,
                        LocalDate.of(2019, 12, 01),
                        LocalDate.of(2023, 9, 30),
                        85.00
                )
        };

        String s = "";
        for (Employee employee : employees) {
            System.out.print(s+employee.toString());
        }

        printUpcomingRetirees(employees);

    }

    public static void printUpcomingRetirees(Employee[] employees) {
        for (Employee employee : employees) {
            LocalDate firstOfCurrentMonth = LocalDate.of(
                    employee.getRetirementPlan().getRetirementDate().getYear(),
                    employee.getRetirementPlan().getRetirementDate().getMonth(),
                    1
            );
            if (isNextMonth(firstOfCurrentMonth, LocalDate.now())) {
                System.out.println(employee);
            }
        }
    }

    private static boolean isNextMonth(LocalDate current, LocalDate maybeNext) {
        int currMonth = current.getMonthValue();
        int prevMonth = maybeNext.getMonthValue();
        int currYear = current.getYear();
        int prevYear = maybeNext.getYear();
        if ((currMonth - prevMonth == 1 && currYear == prevYear) ||
                (currMonth == 1 && prevMonth == 12 && currYear - prevYear == 1)) {
            return true;
        }
        return false;
    }
}
