package structural.facade;

public class Main {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}

