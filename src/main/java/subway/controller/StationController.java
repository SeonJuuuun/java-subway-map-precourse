package subway.controller;

import java.util.Scanner;
import subway.domain.Station;
import subway.domain.StationRepository;
import subway.enums.ControlStation;
import subway.enums.Screen;
import subway.view.InputView;
import subway.view.OutputView;

public class StationController {

    public static void run(Scanner scanner) {
        OutputView.loadView(Screen.STATION);
        chooseFunction(InputView.getInputFunctionCode(Screen.STATION, scanner), scanner);
        MainController.run(scanner);
    }

    private static void chooseFunction(String functionCode, Scanner scanner) {
        if (functionCode.equals(ControlStation.REGISTER.getIndex())) {
            registerStation(scanner);
        }
        if (functionCode.equals(ControlStation.DELETE.getIndex())) {
            deleteStation(scanner);
        }
        if (functionCode.equals(ControlStation.INQUIRY.getIndex())) {
            inquiryStation();
        }
        if (functionCode.equals(ControlStation.BACK.getIndex())) {
            ScreenController.run(Screen.MAIN, scanner);
        }
    }

    private static void registerStation(Scanner scanner) {
        StationRepository.addStation(new Station(InputView.inputRegisterStation(scanner)));
        OutputView.successRegisterMessage();
    }

    private static void deleteStation(Scanner scanner) {
        StationRepository.deleteStation(InputView.inputDeleteStation(scanner));
        OutputView.successDeleteMessage();
    }

    private static void inquiryStation() {
        OutputView.printInquiryMessage();
        StationRepository.stations()
            .forEach(station -> {
                OutputView.printMap(station.getName());
            });
    }
}
