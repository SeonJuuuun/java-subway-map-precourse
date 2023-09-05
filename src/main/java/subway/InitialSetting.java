package subway;

import java.util.List;
import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;

public class InitialSetting {

    private InitialSetting() {
    }

    private static final List<String> LINES = List.of("2호선", "3호선", "신분당선");
    private static final List<String> STATIONS = List.of("교대역", "강남역", "역삼역", "남부터미널역",
        "양재역", "양재시민의숲역", "매봉역");
    private static final List<List<String>> PATH = List.of(
        List.of("교대역", "강남역", "역삼역"),
        List.of("교대역", "남부터미널역", "양재역", "매봉역"),
        List.of("강남역", "양재역", "양재시민의숲역"));
    private static final int ADD_COUNT = 3;

    public static void setting() {
        settingLines();
        settingStations();
    }

    private static void settingLines() {
        for(String lineName : LINES){
            Line line = new Line(lineName);
            LineRepository.addLine(line);
        }
    }

    private static void settingStations() {
        for(String stationName : STATIONS){
            Station station = new Station(stationName);
            StationRepository.addStation(station);
        }
    }
}
