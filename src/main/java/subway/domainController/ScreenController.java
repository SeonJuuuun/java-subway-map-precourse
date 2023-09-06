package subway.domainController;

import java.util.Scanner;
import subway.enums.Screen;

public class ScreenController {

    private ScreenController() {
    }

    public static void run(Screen screen, Scanner scanner) {
        mainStart(screen, scanner);
        lineStart(screen, scanner);
        stationStart(screen, scanner);
        pathStart(screen, scanner);
        mapStart(screen, scanner);
    }

    private static void mainStart(Screen screen, Scanner scanner) {
        if (screen.equals(Screen.MAIN)) {
            MainController.run(scanner);
        }
    }

    private static void lineStart(Screen screen, Scanner scanner) {
        if (screen.equals(Screen.LINE)) {
            LineController.run(scanner);
        }
    }

    private static void stationStart(Screen screen, Scanner scanner) {
        if (screen.equals(Screen.STATION)) {
            StationController.run(scanner);
        }
    }

    private static void pathStart(Screen screen, Scanner scanner) {
        if (screen.equals(Screen.PATH)) {
            PathController.run(scanner);
        }
    }

    private static void mapStart(Screen screen, Scanner scanner) {
        if (screen.equals(Screen.SUBWAY_MAP)) {
            MapController.run(scanner);
        }
    }
}
