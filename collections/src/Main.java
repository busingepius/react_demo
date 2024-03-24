/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 07/03/2024
 * Time : 14:26
 * Project Name : PACKAGE_NAME
 */

public class Main {
    public static void main(String[] args) {
        Person s1 = new Person("Joe");
        Person s2 = new PersonWithJob("Joe",1.0);

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
    }
}
