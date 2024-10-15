package structural.bridge.abstraction;

import structural.bridge.implementor.Device;

public class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void mute() {
        System.out.println("Advanced remote: Muting the device.");
        device.setVolume(0);
    }
    public void maxVolume() {
        System.out.println("Advanced remote: Setting volume to maximum.");
        device.setVolume(100);
    }
}
