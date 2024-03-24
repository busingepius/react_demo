package enumeration;

import java.util.Random;

public enum DayOfTheWeek {
    SUN,    MON,TUE,WED,THU,FRI,SAT;
}

class Main1{
    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.TUE;
        System.out.println(weekDay);

        for(int i = 0; i < 10; i ++){
            weekDay = getRandomDay();
            String s = String.format("Name is %s , ordinal value %d \n",weekDay.name(),weekDay.ordinal());
            System.out.println(s);
        }
    }

    public static DayOfTheWeek getRandomDay(){
        int randomInteger = new Random().nextInt(7);
        DayOfTheWeek[] listOfDays = DayOfTheWeek.values();
        return listOfDays[randomInteger];
    }
}