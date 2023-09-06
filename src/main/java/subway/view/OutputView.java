package subway.view;

import java.util.List;
import subway.enums.Screen;

public class OutputView {

    private static final String START_MESSAGE = "## ";
    private static final String INFO_MESSAGE = "[INFO] ";
    private static final String ERROR_MESSAGE = "[ERROR] ";

    private OutputView() {
    }

    public static void printMessage() {
        System.out.println(START_MESSAGE + "원하는 기능을 선택하세요.");
    }

    public static void printRegisterMessage() {
        System.out.println(START_MESSAGE + "등록할 역 이름을 입력하세요.");
    }

    public static void successRegisterMessage() {
        System.out.println(INFO_MESSAGE + "지하철 역이 등록되었습니다.");
    }

    public static void printDeleteMessage() {
        System.out.println(START_MESSAGE + "삭제할 역 이름을 입력하세요.");
    }

    public static void successDeleteMessage() {
        System.out.println(INFO_MESSAGE + "지하철 역이 삭제되었습니다.");
    }

    public static void printInquiryMessage() {
        System.out.println(START_MESSAGE + "역 목록");
    }

    public static void printMap(String name) {
        System.out.println(INFO_MESSAGE + name);
    }

    public static void loadView(Screen screen) {
        printEnter();
        printTitle(screen.getTitle());
        printFunctionList(screen.getFunctions());
        printEnter();
    }

    private static void printTitle(String title) {
        System.out.println(START_MESSAGE + title);
    }

    private static void printFunctionList(List<String> functionList) {
        for (String function : functionList) {
            System.out.println(function);
        }
    }

    private static void printEnter() {
        System.out.println();
    }
}
