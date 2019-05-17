package MusicShop.Enums;

public enum MusicPiece {

    CHOPSTICKS("Chopsticks", "Allen"),
    ODETOJOY("Ode to Joy", "Beethoven");

    private final String title;
    private final String composer;

    MusicPiece(String title, String composer) {
        this.title = title;
        this.composer = composer;
    }

    public String getTitle() {
        return title;
    }

    public String getComposer() {
        return composer;
    }
}
