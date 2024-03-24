package lab3.one.solution;


/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 02/03/2024
 * Time : 09:38
 * Project Name : lab3.one.lesson3.labs.prob1
 */

public class Main {
    public static void main(String[] args) {
        PersonWithJob p1 = new PersonWithJob("Joe", 30000);
        Person p2 = new Person("Joe");
        // As Persons, p1 should be equal to p2, since names are the same
        System.out.println("p1.equals(p2)? " + p1.getOwner().equals(p2));
        System.out.println("p2.equals(p1)? " + p2.equals(p1.getOwner()));

        PersonWithJob p3 = new PersonWithJob("Joe", 30000);
        PersonWithJob p4 = new PersonWithJob("Joe", 31000);
        // As PersonsWithJobs, p3 should NOT be equal to p4, since salaries are different
        System.out.println("p3.equals(p4)? " + p3.equals(p4));
        System.out.println("p4.equals(p3)? " + p4.equals(p3));
    }
}
