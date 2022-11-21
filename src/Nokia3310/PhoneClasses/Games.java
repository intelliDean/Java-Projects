package Nokia3310.PhoneClasses;

import Practice.GuessingBirthday;

import static Nokia3310.PhoneClasses.Menu.menu;
import static Nokia3310.PhoneDriver.enter;

public class Games {
    public static void games() {
        System.out.println("""
                ***GAMES***"
                1: Guessing Birthday
                2: Roll Some Dice
                3: Back""");
        switch (enter()) {
            case 1-> {
                GuessingBirthday.birthdayGuess();
                games();
            }
            case 2-> menu();
        }
    }
}
