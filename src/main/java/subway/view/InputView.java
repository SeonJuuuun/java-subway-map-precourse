package subway.view;

import java.util.Scanner;
import subway.enums.Screen;

public class InputView {

    private InputView() {
    }

    public static String getInputFunctionCode(Screen screen, Scanner scanner) {
        OutputView.printMessage();
        String functionCode = scanner.nextLine();
        validateInputFunctionCode(functionCode, screen);
        return functionCode;
    }

    private static void validateInputFunctionCode(String functionCode, Screen screen) {
        validateBlank(functionCode);
        validateFunctionCode(functionCode, screen);
    }

    private static void validateBlank(String functionCode) {
        if (functionCode.isBlank()) {
            throw new IllegalArgumentException("기능 입력을 해야 합니다.");
        }
    }

    private static void validateFunctionCode(String functionCode, Screen screen) {
        if (!screen.getFunctionCodes().contains(functionCode)) {
            throw new IllegalArgumentException("올바르지 않은 입력입니다.");
        }
    }

}
