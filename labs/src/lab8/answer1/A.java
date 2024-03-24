/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 08/03/2024
 * Time : 17:47
 * Project Name : lab8
 */
package lab8.answer1;

import java.util.function.Supplier;

class A{
    public static void main(String args[]){
        Supplier<Double> supplier = ()-> Math.random();
        System.out.println(supplier.get());

        Supplier<Double> supplier2 = new Supplier<Double>(){
            @Override
            public Double get(){
                return Math.random();
            }
        };
        System.out.println(supplier2.get());
    }
}



