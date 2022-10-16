package Practice.drivers;

import Practice.Television;

public class TelevisionDriver {
      public static void main(String[] args) {
         Television colorTV = new Television();
         colorTV.turnOn();
         colorTV.setChannel(12);
         new Television().setVolume(6); // new Television() is a new object created but not assigned to
                                       // any Class variable hence it could perform same task as class variable
          Television plasmaTV = new Television();
         plasmaTV.turnOn();
         plasmaTV.channelUp();
         plasmaTV.channelUp();
         plasmaTV.volumeUp();

         System.out.println("tv1's channel is " + colorTV.getChannel() +" and volume level is " + colorTV.getVolumeLevel());
         System.out.println("tv2's channel is " + plasmaTV.getChannel() + " and volume level is " + plasmaTV.getVolumeLevel());
         }
 
}
