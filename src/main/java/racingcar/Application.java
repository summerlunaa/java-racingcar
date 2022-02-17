package racingcar;

import java.util.Scanner;

import racingcar.controller.GameController;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GameController gameController = new GameController(scanner);
		gameController.run();
	}
}
