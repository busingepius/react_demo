package iterator;

/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 06/03/2024
 * Time : 08:13
 * Project Name : PACKAGE_NAME
 */

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        for (Object item : list) {
            String x = (String) item;
            System.out.println(x);
        }

        System.out.println("-".repeat(30));

        var iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
