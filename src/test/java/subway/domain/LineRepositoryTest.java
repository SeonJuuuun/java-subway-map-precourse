package subway.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LineRepositoryTest {

    @BeforeEach
    public void setUp() {
        LineRepository.addLine(new Line("2호선"));
        LineRepository.addLine(new Line("3호선"));
        LineRepository.addLine(new Line("신분당선"));
    }

    @Test
    public void 조건에_맞는_노선_테스트() throws Exception {
        // 존재하는 노선 이름으로 테스트
        Line existLine = LineRepository.getLineByName("2호선");
        assertNotNull(existLine);
        assertEquals("2호선", existLine.getName());

        // 존재하지 않는 노선으로 테스트
        Line notExistLine = LineRepository.getLineByName("1호선");
        assertNull(notExistLine);
    }
}






