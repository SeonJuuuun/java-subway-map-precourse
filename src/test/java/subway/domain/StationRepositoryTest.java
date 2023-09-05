package subway.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class StationRepositoryTest {

    @BeforeEach
    public void setUp() {
        StationRepository.addStation(new Station("교대역"));
        StationRepository.addStation(new Station("강남역"));
        StationRepository.addStation(new Station("역삼역"));
        StationRepository.addStation(new Station("남부터미널역"));
        StationRepository.addStation(new Station("양재역"));
        StationRepository.addStation(new Station("양재시민의숲역"));
        StationRepository.addStation(new Station("매봉역"));
    }

    @Test
    public void testGetStationsByName() {
        // 존재하는 역 이름들로 검색
        List<String> existingStationNames = Arrays.asList("교대역", "강남역", "역삼역");
        List<Station> result1 = StationRepository.getStationsByName(existingStationNames);
        assertNotNull(result1);
        assertEquals(3, result1.size());

        // 존재하지 않는 역 이름들로 검색
        List<String> nonExistingStationNames = Arrays.asList("서초역", "잠실역", "사당역");
        List<Station> result2 = StationRepository.getStationsByName(nonExistingStationNames);
        assertNotNull(result2);
        assertTrue(result2.isEmpty());
    }
}
