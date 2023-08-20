package lotto;

import lotto.controller.GameController;
import lotto.domain.RandomGeneratorNumber;
import lotto.view.InputView;
import lotto.view.OutputView;

public class Application {
    public static void main(String[] args) {
        GameController gameController = new GameController(new RandomGeneratorNumber(), new InputView(), new OutputView());
        gameController.run();
    }
}
