import syntax.HelperNPE;
import syntax.MultilineTextBlocks;
import syntax.NewSwitch;
import syntax.PatternMatchingInstanceOf;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi!");
        //-XX:+ShowCodeDetailsInExceptionMessagesGoogle
        HelperNPE.demo();
        //—enable-preview —release 14
        MultilineTextBlocks.demo();
        NewSwitch.demo();
        PatternMatchingInstanceOf.demo();

    }

}
