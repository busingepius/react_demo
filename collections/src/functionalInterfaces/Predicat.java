/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 07/03/2024
 * Time : 12:08
 * Project Name : functionalInterfaces
 */
package functionalInterfaces;

import java.util.function.Predicate;

public class Predicat implements Predicate<Predicat> {
    private int value;
    public Predicat(int value){
        this.value = value;
    }
    @Override
    public boolean test(Predicat predicate){
        if(predicate == null){
            return false;
        }
        return value == predicate.value;
    }
}

class Main4{
    public static void main(String[] args) {
        System.out.println(new Predicat(1).test(new Predicat(2)));
    }
}
