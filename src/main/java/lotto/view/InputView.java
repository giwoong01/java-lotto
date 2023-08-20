package lotto.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {

    Scanner sc = new Scanner(System.in);

    public int getLottoCount() {
        System.out.println("구입금액을 입력해 주세요.");
        int count = sc.nextInt() / 1000;
        System.out.println();
        return count;
    }

    public List<Integer> getWinningNumber() {
        System.out.println("당첨 번호를 입력해 주세요.");
        List<Integer> winningNumber = toList(sc.next());
        System.out.println();
        return winningNumber;
    }

    private List<Integer> toList(String inputNumber) {
        return Arrays.stream(inputNumber.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public String getBonusNumber() {
        System.out.println("보너스 번호를 입력해 주세요.");
        String bonusNumber = sc.next();
        System.out.println();
        return bonusNumber;
    }
}
