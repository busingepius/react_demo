package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 06/03/2024
 * Time : 11:33
 * Project Name : PACKAGE_NAME
 */

public class ListInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("w");
        list.add("e");
        list.add(2,"e");
        System.out.println(list);

        Collections.addAll(list,"a","b","c");
        System.out.println(list.get(0));

        // updating
        list.set(0,"a++");
        System.out.println(list.get(0));
        // remove
        list.remove(0);
        System.out.println(list.indexOf("e"));

        System.out.println(list.lastIndexOf("e"));
        List<String> subList = list.subList(0,2);
        System.out.println(subList);
    }
}
