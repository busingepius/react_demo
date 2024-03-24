/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 08/03/2024
 * Time : 18:29
 * Project Name : lab8.Examples
 */
package lab8.Examples;

// PART 1

import lab8.answer2.comparator2.EmployeeNameComparator;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

class Evaluator {
    class Employee {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class Apple {
        private Double weight;

        public Double getWeight() {
            return weight;
        }

        public void setWeight(Double name) {
            this.weight = name;
        }
    }

    // Example: (String x) -> x.toUpperCase();
    Function<String, String> toUpper1 = (String x) -> x.toUpperCase();
    Function<String, String> toUpper2 = String::toUpperCase;
// Method reference type: Class::instanceMethod

    // A. (Employee e) -> e.getName();
    Function<Employee, String> theNameLambdaMethod1 = (Employee e) -> e.getName();
    Function<Employee, String> theNameLambdaMethod2 = Employee::getName;
// Method reference type: Class::instanceMethod

    // B. (Employee e,String s) -> e.setName(s);
    BiConsumer<Employee, String> setNameLambdaMethod1 = (Employee e, String s) -> e.setName(s);
    BiConsumer<Employee, String> setNameLambdaMethod2 = Employee::setName;
// Method reference type: Class::instanceMethod

    // C. (String s1,String s2) -> s1.compareTo(s2);
    Comparator<String> compareLambdaMethod1 = (String s1, String s2) -> s1.compareTo(s2);
    Comparator<String> compareLambdaMethod2 = String::compareTo;
// Method reference type: Class::instanceMethod

    // D. (Integer x,Integer y) -> Math.pow(x,y);
    BiFunction<Integer, Integer, Double> powerLambdaMethod1 = (Integer x, Integer y) -> Math.pow(x, y);
    BiFunction<Integer, Integer, Double> powerLambdaMethod2 = Math::pow;
// Static Method reference type: Class::staticMethod

    // E. (Apple a) -> a.getWeight();
    Function<Apple, Double> getWeightLambdaMethod1 = (Apple a) -> a.getWeight();
    Function<Apple, Double> getWeightLambdaMethod2 = Apple::getWeight;
// Method reference type: Class::instanceMethod

    // F. (String x) -> Integer.parseInt(x);
    Function<String, Integer> parseIntLambdaMethod1 = (String x) -> Integer.parseInt(x);
    Function<String, Integer> parseIntLambdaMethod2 = Integer::parseInt;
// Static Method reference type: Class::staticMethod

    /*/ G.*/ EmployeeNameComparator comp = new EmployeeNameComparator();
    // (Employee e1, Employee e2) -> comp.compare(e1,e2);
    // BiFunction<Employee, Employee, Integer> compareLambdaMethod11 = (Employee e1, Employee e2) -> comp.compare(e1, e2);
    // BiFunction<Employee, Employee, Integer> compareLambdaMethod22 = comp::compare; // calling a compare method on the object
// Method reference type: object::instanceMethod

/*    void evaluator() {
            System.out.println(toUpper2.apply("hello"));
            test your other method references
    }*/
}
