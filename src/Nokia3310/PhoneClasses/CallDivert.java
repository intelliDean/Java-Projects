package Nokia3310.PhoneClasses;

import static Nokia3310.PhoneClasses.Menu.menu;
import static Nokia3310.PhoneDriver.enter;

public class CallDivert {
    public static void callDivert() {
        System.out.printf("%n%s%n%d: %s%n",
                "***CALL DIVERT***", 1, "Go back");
        if (enter() == 1) {
            menu();
        }
    }
}
