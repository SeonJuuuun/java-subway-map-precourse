package subway.enums;

import java.util.List;

public enum Screen {

    MAIN("B", "메인 화면", List.of("1. 역 관리", "2. 노선 관리", "3. 구간 관리", "4. 지하철 노선도 출력", "Q. 종료")),
    STATION("1", "역 관리", List.of("1. 역 등록", "2. 역 삭제", "3. 역 조회", "B. 돌아가기")),
    LINE("2", "노선 관리", List.of("1. 노선 등록", "2. 노선 삭제", "3. 노선 조회", "B. 돌아가기")),
    PATH("3", "구간 관리", List.of("1. 구간 등록", "2. 구간 삭제", "B. 돌아가기")),
    SUBWAY_MAP("4", "지하철 노선도 출력", List.of());

    private final String index;
    private final String title;
    private final List<String> functions;

    Screen(String index, String title, List<String> functions) {
        this.index = index;
        this.title = title;
        this.functions = functions;
    }

    public String getIndex() {
        return index;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getFunctions() {
        return functions;
    }
}
