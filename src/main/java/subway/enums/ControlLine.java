package subway.enums;

public enum ControlLine {

    REGISTER("1"),
    DELETE("2"),
    INQUIRY("3"),
    BACK("B");

    private final String index;

    ControlLine(String index) {
        this.index = index;
    }

    public String getIndex() {
        return index;
    }
}
