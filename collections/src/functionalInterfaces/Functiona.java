/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 07/03/2024
 * Time : 11:51
 * Project Name : functionalInterfaces
 */
package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Functiona implements Function<Integer, Functiona>, Consumer<Functiona> {// <input,return> types
    private int value;

    private Functiona(int value) {
        this.value = value;
    }

    public Functiona() {
    }

    @Override
    public Functiona apply(Integer value) {
        return new Functiona(value);
    }

    @Override
    public void accept(Functiona funct){
        System.out.println(funct);
    }

    @Override
    public String toString() {
        return "Functiona{" +
                "value=" + value +
                '}';
    }
}

class Main3 {
    public static void main(String[] args) {
        List<Functiona> functions = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            functions.add(new Functiona().apply(i));
        }
        functions.forEach(new Functiona());

    }
}
