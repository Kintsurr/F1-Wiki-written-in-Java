package enums;

public enum Engines {
    FERRARI("Team uses Ferrari Engine"),
    RED_BULL("Team uses Red Bull engine"),
    MERCEDES("Team uses Mercedes AMG engine"),
    RENAULT("Team uses Renault Engine");

    public final String label;

    private Engines(String label) {
        this.label = label;
    }
}
