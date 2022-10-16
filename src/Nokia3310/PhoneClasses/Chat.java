package Nokia3310.PhoneClasses;

import static Nokia3310.PhoneClasses.Menu.menu;
import static Nokia3310.PhoneDriver.enter;

public class Chat {
    public static void chat() {
        System.out.printf("%n%s%n%d:%s%n", "***CHAT***", 1, "Back");
        if (enter() == 1) {
            menu();
        }
    }
}
