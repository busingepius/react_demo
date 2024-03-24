/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 02/03/2024
 * Time : 08:44
 * Project Name : lab3.one.solution
 */
package lab3.one.solution;

import java.util.Objects;

public class PersonWithJob {

    private double salary;

    public Person getOwner() {
        return owner;
    }

    private Person owner;

    public double getSalary() {
        return salary;
    }

    public PersonWithJob(String n, double s) {
        this.salary = s;
        this.owner = new Person(n);
    }


    @Override
    public boolean equals(Object aPerson) {

        if (!(aPerson instanceof PersonWithJob)) {
            return false;
        }

        PersonWithJob personWithJob = (PersonWithJob) aPerson;
        return salary == personWithJob.getSalary()
                && Objects.equals(
                        owner.getName(),
                personWithJob.owner.getName()
        );
    }

}
