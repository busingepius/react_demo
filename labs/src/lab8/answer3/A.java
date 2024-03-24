/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 08/03/2024
 * Time : 17:42
 * Project Name : lab8.answer3
 */
package lab8.answer3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

class A{
    public static void main(String args[]){
        BiFunction<Double, Double, List<Double>> createList = (x, y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x, y));
            list.add(x * y);
            return list;
        };

        System.out.println(createList.apply(2.0,3.0));
    }
}
