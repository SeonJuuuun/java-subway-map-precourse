package subway.domain;

import java.util.List;

public class Path {

    private final Line line;
    private final List<Station> stations;

    public Path(Line line, List<Station> stations) {
        this.line = line;
        this.stations = stations;
    }

    public Line getLine() {
        return line;
    }

    public List<Station> getStations() {
        return stations;
    }
}
