package structural.bridge.implementor;

public class TV implements Device{
    private boolean on = false;
    private int volume = 30;
    @Override
    public void turnOn() {
        on = true;
        System.out.println("TV is turned on.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV is turned off.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV volume set to " + this.volume);
    }

    @Override
    public boolean isEnabled() {
        return on;
    }
}
