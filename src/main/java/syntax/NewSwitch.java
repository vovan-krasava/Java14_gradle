package syntax;

import java.time.DayOfWeek;
import java.time.Month;


public class NewSwitch {

public static void demo(){
    System.out.println("Java8 example: " + java8(Month.AUGUST));
    System.out.println("Java14 example: " + java14(Month.AUGUST));
    System.out.println("Java14 multiline example: " + multiLineSwitchJava14(DayOfWeek.FRIDAY));
}

    public static String java8(Month month) {
    String season = "";
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                season = "winter";
                break;
            case MARCH:
            case APRIL:
            case MAY:
                season =  "spring";
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                season = "summer";
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                season = "autumn";
                break;
        }
        return "It's " + season + ".";
    }

    public static String java14(Month month){
    var season = "";
        switch (month) {
            case DECEMBER, JANUARY, FEBRUARY  -> { season = "winter"; }
            case MARCH, APRIL, MAY            -> { season = "spring"; }
            case JUNE, JULY, AUGUST           -> { season = "summer"; }
            case SEPTEMBER, OCTOBER, NOVEMBER -> { season = "autumn"; }
        }
        return "It's " + season + ".";
    }


    public static int multiLineSwitchJava14(DayOfWeek dayOfWeek) {
        return switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> 1;
            default    -> {
                System.out.println("It's a weekend day.");
                yield 0;
            }
        };
    }

}
