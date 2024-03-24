/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 08/03/2024
 * Time : 17:27
 * Project Name : lab8
 */
package lab8.answer5;

import java.util.Arrays;
import java.util.List;

public class Lab7Prob3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
                "Away", "On Vacation", "Everywhere you want to be");

        // (a) Use a lambda expression instead of directly defining a Consumer
        list.forEach((item)-> System.out.println(item.toUpperCase()));

        // (b) Use a method reference in place of your lambda expression in (a)
        list.forEach(System.out::println);
    }
}
