package subway.domainController;

import java.util.Scanner;
import subway.enums.Screen;
import subway.view.InputView;
import subway.view.OutputView;

public class StationController {

    public static void run(Scanner scanner) {
        OutputView.loadView(Screen.STATION);
        chooseFunction(InputView.getInputFunctionCode(Screen.STATION, scanner), scanner);
    }

    private static void chooseFunction(String functionCode, Scanner scanner) {
    }
}