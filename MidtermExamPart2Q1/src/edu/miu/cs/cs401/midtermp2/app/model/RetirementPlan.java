/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 05/03/2024
 * Time : 11:11
 * Project Name : edu.miu.cs.cs401.midtermp2.app.model
 */
package edu.miu.cs.cs401.midtermp2.app.model;

import java.time.LocalDate;

public class RetirementPlan {
    private String referenceNumber;

    private LocalDate enrollmentDate; /* (e.g. 2022-01-17, 2023-02-20, etc.)*/
    private LocalDate retirementDate; /* (e.g. 2023-09-13, 2023-09-21, etc.) */
    private double monthlyContribution; /* (e.g. $100.00, $950.00 etc.)*/


    private Employee employee;

    RetirementPlan(String referenceNumber,
                   LocalDate enrollmentDate,
                   LocalDate retirementDate,
                   double monthlyContribution,
                   Employee employee
    ) {
        this.referenceNumber = referenceNumber;
        this.enrollmentDate = enrollmentDate;
        this.retirementDate = retirementDate;
        this.monthlyContribution = monthlyContribution;
        this.employee = employee;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public LocalDate getRetirementDate() {
        return retirementDate;
    }

    public double getMonthlyContribution() {
        return monthlyContribution;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return "RetirementPlan{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", enrollmentDate=" + enrollmentDate +
                ", retirementDate=" + retirementDate +
                ", monthlyContribution=$" + monthlyContribution +
                '}';
    }
}
