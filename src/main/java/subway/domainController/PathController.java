package subway.domainController;

import java.util.Scanner;
import subway.enums.Screen;
import subway.view.InputView;
import subway.view.OutputView;

public class PathController {

    public static void run(Scanner scanner) {
        OutputView.loadView(Screen.PATH);
        chooseFunction(InputView.getInputFunctionCode(Screen.PATH, scanner), scanner);
    }

    private static void chooseFunction(String functionCode, Scanner scanner) {
    }
}
