/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 05/03/2024
 * Time : 11:07
 * Project Name : edu.miu.cs.cs401.midtermp2.app.model
 */
package edu.miu.cs.cs401.midtermp2.app.model;

import java.time.LocalDate;

public class Employee {
    private long employeeId;
    private String firstName;

    private String lastName;
    private double yearlySalary;
    private RetirementPlan retirementPlan;
    public Employee(
            long employeeId,
             String referenceNumber,
             String firstName,
             String lastName,
             double yearlySalary,
             LocalDate enrollmentDate,
             LocalDate retirementDate,
             double monthlyContribution
    ) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearlySalary = yearlySalary;
        this.retirementPlan = new RetirementPlan(
                referenceNumber,
                enrollmentDate,
                retirementDate,
                monthlyContribution,
                this
        );
    }

    public RetirementPlan getRetirementPlan(){
        return retirementPlan;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearlySalary=" + yearlySalary +
                ", retirementPlan=" + retirementPlan +
                '}';
    }
}
