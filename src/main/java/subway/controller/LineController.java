package subway.controller;

import java.util.Scanner;
import subway.enums.Screen;
import subway.view.InputView;
import subway.view.OutputView;

public class LineController {

    public static void run(Scanner scanner) {
        OutputView.loadView(Screen.LINE);
        chooseFunction(InputView.getInputFunctionCode(Screen.LINE, scanner), scanner);
    }

    private static void chooseFunction(String functionCode, Scanner scanner) {
    }
}