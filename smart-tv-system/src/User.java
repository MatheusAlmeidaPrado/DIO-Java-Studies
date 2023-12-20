public class User {
    public static void main(String[] args) throws Exception {
    
        SmartTv smartTv = new SmartTv();

        // This class/method simulates the actions of a person using a TV remote...
        //Run on Debug to see the line prints!

        System.out.println("Is the TV on?    " + (smartTv.onOff ? "Yes!" : "No!"));

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
    }
}
