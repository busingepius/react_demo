/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 02/03/2024
 * Time : 08:43
 * Project Name : lab3.one.solution
 */
package lab3.one.solution;


import java.util.Objects;

public class Person {

    private String name;
    private PersonWithJob personWithJob;

    Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object aPerson) {

        if (!(aPerson instanceof Person)) {
            return false;
        }

        Person person = (Person) aPerson;
        return Objects.equals(
                name,
                person.getName()
        );

    }
}

