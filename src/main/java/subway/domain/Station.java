package subway.domain;

public class Station {

    private final int NAME_LENGTH = 2;

    private String name;

    public Station(String name) {
        validate(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void validate(String name) {
        if (StationRepository.validateExistStation(name)) {
            throw new IllegalArgumentException("[ERROR] 이미 등록되어 있는 지하철 역입니다.");
        }
        if (validateNameLength(name)) {
            throw new IllegalArgumentException("[ERROR] 지하철 역 이름은 2글자 이상이어야 합니다.");
        }
    }

    private boolean validateNameLength(String name) {
        return name.length() < NAME_LENGTH;
    }
}
