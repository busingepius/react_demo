package enumeration;

public enum Topping { // extends Enum and can implement interfaces
    MUSTARD(1), PICKLES(2), BACON(3), CHEDDAR(4), TOMATO(5); //instances

    private int value;

    private Topping(int value) { // implicitly private // used to represent possibilities of the constants
        this.value = value;
    }

    public double getPrice() {
        return switch (this) {
            case BACON -> 1.5;
            case CHEDDAR -> 1.0;
            case MUSTARD -> 3.0;
            case PICKLES -> {
                double value = 12.0;
                yield value;
            }
//            case TOMATO -> 5.0;
            default -> 0.0;
        };
    }

    public void setValue(int value) {
        this.value = value;
    }

    private int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name=" + name() +
                ", " +
                "value=" + value +
                '}';
    }
}

class Main3 {
    public static void main(String[] args) {
         Topping.BACON.setValue(123);

        for (Topping topping : Topping.values()) {
            if (topping.name() == "MUSTARD")
                topping.setValue(4345);
            System.out.println(topping + " : " + topping.getPrice());
        }
    }
}