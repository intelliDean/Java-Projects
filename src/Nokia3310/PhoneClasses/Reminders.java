package Nokia3310.PhoneClasses;

import static Nokia3310.PhoneClasses.Menu.menu;
import static Nokia3310.PhoneDriver.enter;

public class Reminders {
    public static void reminders(){
        System.out.printf("%n%s%n%d: %s%n",
                "***REMINDERS***", 1, "Go back");
        if (enter() == 1) {
            menu();
        }
    }
}
