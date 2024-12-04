package enumSvetafor;

public enum Svetafor {
    RED("dayan"),
    YELLOW("hazirlas"),
    GREEN("yol senindir");

    private final String action;

    private Svetafor(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
