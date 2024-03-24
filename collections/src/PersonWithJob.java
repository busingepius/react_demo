import java.util.Objects;

/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 07/03/2024
 * Time : 14:23
 * Project Name : PACKAGE_NAME
 */

public class PersonWithJob extends Person{
    private String name;
    private double salary;
    public PersonWithJob(String name,double salary) {
        super(name);this.salary = salary;
    }



    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
        if(!(object instanceof  PersonWithJob))return false;
        PersonWithJob person = (PersonWithJob) object;
        return salary == person.salary && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary);
    }
}
