/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 06/03/2024
 * Time : 20:58
 * Project Name : set
 */
package set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("c");
        System.out.println(set);

        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "b", "c", "d", "a", "c");
        Set<String> sett = new HashSet<>(collection);
        System.out.println(collection);
        System.out.println(sett);

        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));
        // union
        set1.addAll(set2);
        System.out.println(set1);
        // intersection
        set1.retainAll(set2);
        System.out.println(set1);
        // difference
        set1.removeAll(set2);
        System.out.println(set2);
    }
}
