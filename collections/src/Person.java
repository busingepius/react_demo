import java.util.Objects;

/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 07/03/2024
 * Time : 14:23
 * Project Name : PACKAGE_NAME
 */

public class Person {
    public String getName() {
        return name;
    }

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
        if(!(object instanceof  Person))return false;
        Person person = (Person) object;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
