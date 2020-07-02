package syntax;

public class PatternMatchingInstanceOf {


    public static void demo(){
        System.out.println("Java 8 example: " + java8("Java 8"));
        System.out.println("Java 14 example: " + java14("Java 14"));
    }

    public static String java8(Object o){
        if (o instanceof String){
            String a = (String) o;
            return a;
        }
        return null;
    }

    public static String java14(Object o){
        if (o instanceof String a){
            return a;
        }
        return null;
    }


}


