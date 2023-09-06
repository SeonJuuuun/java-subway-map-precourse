package subway.domainController;

import java.util.Scanner;
import subway.enums.Screen;
import subway.view.InputView;
import subway.view.OutputView;

public class MapController {

    public static void run(Scanner scanner) {
        OutputView.loadView(Screen.SUBWAY_MAP);
        chooseFunction(InputView.getInputFunctionCode(Screen.SUBWAY_MAP, scanner), scanner);
    }

    private static void chooseFunction(String functionCode, Scanner scanner) {
    }
}