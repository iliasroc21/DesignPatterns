package structural.bridge.abstraction;

import structural.bridge.implementor.Device;

public abstract class RemoteControl {
    protected Device device;
    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    public void setVolume(int volume) {
        device.setVolume(volume);
    }
    public abstract void mute();
    public abstract void maxVolume();
}
