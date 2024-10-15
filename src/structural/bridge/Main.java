package structural.bridge;


import structural.bridge.abstraction.AdvancedRemote;
import structural.bridge.abstraction.BasicRemote;
import structural.bridge.abstraction.RemoteControl;
import structural.bridge.implementor.Device;
import structural.bridge.implementor.Radio;
import structural.bridge.implementor.TV;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl basicRemote = new BasicRemote(tv);
        basicRemote.togglePower();
        basicRemote.setVolume(40);
        basicRemote.togglePower();
        basicRemote.mute();

        System.out.println("------------------------------------------------");

        Device radio = new Radio();
        RemoteControl advancedRemote = new AdvancedRemote(radio);
        advancedRemote.togglePower();
        advancedRemote.setVolume(70);
        advancedRemote.mute();
        advancedRemote.maxVolume();
        advancedRemote.togglePower();
    }
}
