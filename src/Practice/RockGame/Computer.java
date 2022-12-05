package Practice.RockGame;

import java.security.SecureRandom;

public class Computer {

    public Computer() {
    }

    public int play() {
        SecureRandom random = new SecureRandom();
        return random.nextInt(3);
    }
}
