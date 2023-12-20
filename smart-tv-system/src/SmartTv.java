public class SmartTv {

    boolean onOff = false;  //TV starts off.
    int channel = 1;
    int volume = 50;
    
    public void turnOnOff() {

        onOff = !onOff;

        if (onOff) {
            System.out.println("The TV is now On!");
            System.out.println("Current channel: " + channel);
            System.out.println("Current volume:  " + volume);
        } else {
            System.out.println("The TV is now Off!");
        }
    }

    public void turnVolumeUp() {
        if (onOff) {
            volume++;
            System.out.println("Volume: " + volume);
        }
    }

    public void turnVolumeDown() {
        if (onOff) {
            volume--;
            System.out.println("Volume: " + volume);
        }
    }

    public void goNextChannel() {
        if (onOff) {
            channel++;
            System.out.println("Channel: " + channel);
        }
    }

    public void goPreviousChannel() {
        if (onOff) {
            channel--;
            System.out.println("Channel: " + channel);
        }
    }

    public void changeToChannel(int newChannel) {
        if (onOff) {
            channel = newChannel;
            System.out.println("Channel: " + channel);
        }
    }
}