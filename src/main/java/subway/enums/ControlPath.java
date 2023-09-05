package subway.enums;

public enum ControlPath {

    REGISTER("1"),
    DELETE("2"),
    BACK("B");

    private final String index;

    ControlPath(String index) {
        this.index = index;
    }

    public String getIndex() {
        return index;
    }
}
