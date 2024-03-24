/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 06/03/2024
 * Time : 20:18
 * Project Name : queue
 */
package queue;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");
        System.out.println(queue); // [c, a, b]

        queue.offer("d");// [c, a, b, d] // boolean
        System.out.println(queue);

        var pick1 = queue.peek(); // null
        System.out.println(pick1);
        var pick2 = queue.element(); // NoSuchElementException
        System.out.println(pick2);

        var remove1 = queue.remove(); // NoSuchElementException
        System.out.println(remove1);
        var remove2 = queue.poll(); // null
        System.out.println(remove2);
    }
}
