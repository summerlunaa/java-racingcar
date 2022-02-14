package racingcar.view;

import racingcar.Utils;
import racingcar.validator.MoveCountValidator;

import java.util.Scanner;

public class InputView {
	public static final String REQUEST_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String REQUEST_MOVE_COUNT = "시도할 회수는 몇회인가요?";

	public static String[] getCarNames(Scanner scanner) {
		System.out.println(REQUEST_CAR_NAMES);
		String inputNames = scanner.nextLine();
		return Utils.splitAndTrim(inputNames);
	}

	public static String getMoveCount(Scanner scanner) {
		try {
			System.out.println(REQUEST_MOVE_COUNT);
			String inputMoveCount = scanner.nextLine();
			MoveCountValidator.validateMoveCount(inputMoveCount);
			return inputMoveCount;
		} catch (IllegalArgumentException exception) {
			System.out.println(exception.getMessage());
			return getMoveCount(scanner);
		}
	}
}
