package subway.domainController;

import java.util.Scanner;
import subway.enums.Screen;
import subway.view.InputView;
import subway.view.OutputView;

public class MainController {

    private static final String QUIT = "Q";

    private MainController() {
    }

    public static void run(Scanner scanner) {
        OutputView.loadView(Screen.MAIN);
        shiftFunctionScreen(InputView.getInputFunctionCode(Screen.MAIN, scanner), scanner);
    }

    private static void shiftFunctionScreen(String functionIndex, Scanner scanner) {
        if (functionIndex.equals(Screen.STATION.getIndex())) {
            ScreenController.run(Screen.STATION, scanner);
        }
        if (functionIndex.equals(Screen.LINE.getIndex())) {
            ScreenController.run(Screen.LINE, scanner);
        }
        if (functionIndex.equals(Screen.PATH.getIndex())) {
            ScreenController.run(Screen.PATH, scanner);
        }
        if (functionIndex.equals(Screen.SUBWAY_MAP.getIndex())) {
            ScreenController.run(Screen.SUBWAY_MAP, scanner);
        }
        if (functionIndex.equals(QUIT)) {
            quitProgram(scanner);
        }
    }

    private static void quitProgram(Scanner scanner) {
        scanner.close();
        System.exit(0);
    }
}