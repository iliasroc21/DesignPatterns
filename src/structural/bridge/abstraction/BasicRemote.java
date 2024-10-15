package structural.bridge.abstraction;

import structural.bridge.implementor.Device;

public class BasicRemote extends RemoteControl {

    public BasicRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Remote: Muting the device.");
        device.setVolume(0);
    }

    @Override
    public void maxVolume() {
        System.out.println("Basic remote: Setting volume to maximum.");
        device.setVolume(50);
    }

}
