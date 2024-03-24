/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 07/03/2024
 * Time : 11:19
 * Project Name : functionalInterfaces
 */
package functionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consuma implements Consumer<Consuma> {
    private int value;

    public Consuma(int value) {
        this.value = value;
    }

    @Override
    public void accept(Consuma consumer) {
        System.out.println(consumer);
    }

    @Override
    public String toString() {
        return "Consuma{" +
                "value=" + value +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        List<Consuma> consumas = new ArrayList<>(List.of(new Consuma(1), new Consuma(2), new Consuma(3), new Consuma(4)));
//        List<Consuma> consumas = new ArrayList<>(Arrays.asList(new Consuma(1), new Consuma(2), new Consuma(3), new Consuma(4)));

        consumas.forEach(new Consuma(1234));
    }
}
