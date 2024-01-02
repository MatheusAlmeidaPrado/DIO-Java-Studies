public class SmartTv {

    /*
    This Class simulates the functions of a common TV.
    Run the User.java on Debug to check it out!
    (Or run User.class on a Terminal) 
    */
    boolean onOff = false;  //TV starts off. Can't change anything if it's off.
    int channel = 1;        //Initial Channel.
    int volume = 50;        //Initial Volume value.
    

    //This method switches the TV between On and Off.
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


    //This method turn the volume up by 1.
    public void turnVolumeUp() {
        
        if (onOff) {
            volume++;
            System.out.println("Volume: " + volume);
        }
    }


    //This method turns the volume down by 1.
    public void turnVolumeDown() {
        if (onOff) {
            volume--;
            System.out.println("Volume: " + volume);
        }
    }


    //This method changes to the next Channel.
    public void goNextChannel() {
        if (onOff) {
            channel++;
            if(channel > 999) {     //999 is the last channel, then it loops back to 1.
                channel = 1;
            }
            System.out.println("Channel: " + channel);
        }
    }


    //This method changes to the previous Channel.
    public void goPreviousChannel() {
        if (onOff) {
            channel--;
            if(channel < 1) {       //1 is the first channel, going back loops to 999.
                channel = 999;
            }
            System.out.println("Channel: " + channel);
        }
    }


    //This method changes to your specified Channel.
    public void changeToChannel(int newChannel) {
        if (onOff) {
            if(newChannel < 1) {            //If the number specified is too low, go to 1.
                channel = 1;
            } else if (newChannel > 999) {  //If the number specified is too high, go to 999.
                channel = 999;
            } else {                        //If it's within 1 and 999, go to it.
                channel = newChannel;
            } 
            System.out.println("Channel: " + channel);
        }
    }
}