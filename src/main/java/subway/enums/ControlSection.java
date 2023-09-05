package subway.enums;

public enum ControlSection {

    REGISTER("1"),
    DELETE("2"),
    BACK("B");

    private final String index;

    ControlSection(String index) {
        this.index = index;
    }

    public String getIndex() {
        return index;
    }
}
