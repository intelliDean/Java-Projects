package Practice;

public class Television {
    int channel = 1; // Default channel is 1
    boolean on = false;
    int volumeLevel = 1; // Default volume level is 1
    public Television() {       // No arg constructor
    }

    public void turnOn() {      // true turns TV on
        on = true;
    }
    public void turnOff() {     // false turns TV off
        on = false;
    }
    public void setChannel(int newChannel) {
         if (on && newChannel >= 1 && newChannel <= 120) {
             channel = newChannel;
         }
    }
    public void setVolume(int newVolumeLevel) {
         if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
             volumeLevel = newVolumeLevel;
         }
    }
    public void channelUp() {
         if (on && channel < 120) {
             channel++;
         }
    }
    public void channelDown() {
         if (on && channel > 1) {
             channel--;
         }
    }
    public void volumeUp() {
         if (on && volumeLevel < 7) {
             volumeLevel++;
         }
    }
    public void volumeDown() {
         if (on && volumeLevel < 1) {
             volumeLevel--;
         }
    }
    public int getChannel() {
        return channel;
    }
    public int getVolumeLevel() {
        return  volumeLevel;
    }
}
