package com.app;


import com.wrapper.LogWrapper;
import org.jetbrains.annotations.NotNull;
//import com.service.Logger;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {
    static LogWrapper Logger = new LogWrapper();
    static int val = switch ("bar") {
        case "foo" -> 1;
        case "bar" -> 2;
        case "baz" -> 3;
        default -> -1;

    };

    public static void showVAR() {
//VAR
        var list = new ArrayList<String>();
        list.add("QWERTY");
        //list.add(null);
        list.add("TREWQ");
        list.add("ZXCV");

//VAR in lambda, only for annotation
        Logger.log(
                list.stream()
                        .map((@NotNull var s) -> s.toLowerCase())
                        .collect(Collectors.toList())
        );
    }

    public static void showAPIChange() {
//java.lang.String
        String a = "   ";
        Logger.log("isEmpty?"+a.isEmpty());
        Logger.log("isBlank?"+a.isBlank());

        Logger.log("Hi!".repeat(5));

        Logger.log("      Empty space1   ".trim());
        Logger.log("      Empty space2   ".strip());

//java.util.function.Predicate
        var lines = new ArrayList<String>();
        lines.add("QWERTY");
        lines.add(" ");
        lines.add("");
        lines.add("!");

        Logger.log(
                lines.stream()
                        .filter(s -> !s.isBlank())
                        .collect(Collectors.toList())
        );

        Logger.log(
                lines.stream()
                        .filter(Predicate.not(String::isBlank))
                        .collect(Collectors.toList())
        );

//        String aA = null;
//        Logger.log(aA.isBlank());

    }


}


