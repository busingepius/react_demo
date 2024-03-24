/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 06/03/2024
 * Time : 08:35
 * Project Name : collection
 */
package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("1");
        collection.add("2");

        for (String s : collection) {
            System.out.println(s);
        }

        System.out.println(collection);

        Collections.addAll(collection, "w", "3", "#");
        System.out.println(collection.size());
        System.out.println(collection.remove("3"));
        collection.clear();

        System.out.println(collection.isEmpty());

        Boolean containsA = collection.contains("a");
//        String[] oArray = collection.toArray(String[]::new);
        String[] oArray = collection.toArray(new String[0]);
        System.out.println(oArray);

        Collection<String> other = new ArrayList<>();
        other.addAll(collection);
        System.out.println(collection.equals(other));


    }
}
