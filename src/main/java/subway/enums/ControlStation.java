package subway.enums;

public enum ControlStation {

    REGISTER("1"),
    DELETE("2"),
    INQUIRY("3"),
    BACK("B");

    private final String index;

    ControlStation(String index) {
        this.index = index;
    }

    public String getIndex() {
        return index;
    }
}
