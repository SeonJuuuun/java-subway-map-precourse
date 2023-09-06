package subway;

import java.util.Scanner;
import subway.domainController.ScreenController;
import subway.enums.Screen;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO: 프로그램 구현
        InitialSetting.setting();
        ScreenController.run(Screen.MAIN, scanner);
    }
}
