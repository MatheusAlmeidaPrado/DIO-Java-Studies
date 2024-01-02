public class User {
    public static void main(String[] args) throws Exception {
    
        /*
        This class/method simulates the actions of a person using a TV remote.
        Run on Debug to check it out!
        */

        //Initiates an instance of the SmartTv.class:
        SmartTv smartTv = new SmartTv();

        //Check i the TV is on:
        System.out.println("Is the TV on?    " + (smartTv.onOff ? "Yes!" : "No!"));

        //Turn the TV on and simulate using it:
        smartTv.turnOnOff();

        smartTv.turnVolumeDown();
        smartTv.turnVolumeDown();
        smartTv.turnVolumeDown();
        smartTv.turnVolumeDown();
        smartTv.turnVolumeUp();

        smartTv.goNextChannel();
        smartTv.goNextChannel();
        smartTv.goPreviousChannel();
        smartTv.changeToChannel(321);
        smartTv.changeToChannel(7556);
    }
}
