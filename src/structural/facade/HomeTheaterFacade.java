package structural.facade;

import structural.facade.subsystem.Amplifier;
import structural.facade.subsystem.DVDPlayer;
import structural.facade.subsystem.Lights;
import structural.facade.subsystem.Projector;

public class HomeTheaterFacade {
    private Amplifier amp = new Amplifier();
    private DVDPlayer dvd = new DVDPlayer();
    private Lights lights= new Lights();
    private Projector projector = new Projector();
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        amp.on();
        projector.on();
        projector.wideScreenMode();
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        lights.on();
        amp.off();
        projector.off();
        dvd.off();
    }
}
