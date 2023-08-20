package lotto.controller;

import lotto.domain.GeneratorNumber;
import lotto.domain.Lotto;
import lotto.domain.LottoList;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GameController {

    private final GeneratorNumber generatorNumber;
    private final InputView inputView;
    private final OutputView outputView;

    public GameController(GeneratorNumber generatorNumber, InputView inputView, OutputView outputView) {
        this.generatorNumber = generatorNumber;
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        getLottoList(inputView.getLottoCount());

        List<Integer> winningNumber = inputView.getWinningNumber();

        String bonusNumber = inputView.getBonusNumber();
    }

    public void getLottoList(int value) {
        outputView.lottoListPrint(value,
                new LottoList(
                        IntStream.range(0, value)
                                .mapToObj(i -> new Lotto(generatorNumber.generatorNumber()))
                                .collect(Collectors.toList())
                ));
    }

}
