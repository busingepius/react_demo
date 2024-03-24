/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 07/03/2024
 * Time : 11:30
 * Project Name : functionalInterfaces
 */
package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Supplaya implements Supplier<Supplaya> {
    private int value;

    private Supplaya(int value) {
        this.value = value;
    }
    public Supplaya(){this.value = 4;}

    @Override
    public Supplaya get() {
        int val = new Random().nextInt(value);
        return new Supplaya(val);
    }

    @Override
    public String toString() {
        return "Supplaya{" +
                "value=" + value +
                '}';
    }
}

class Main2 {
    public static void main(String[] args) {
        List<Supplaya> suppliers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            suppliers.add(new Supplaya().get());
        }
        suppliers.forEach(new Consumer<Supplaya>() {
            @Override
            public void accept(Supplaya supplaya) {
                System.out.println(supplaya);
            }
        });
    }
}
