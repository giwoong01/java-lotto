package lotto.view;

import lotto.domain.LottoList;

public class OutputView {

    public void lottoListPrint(int value, LottoList lottoList) {
        System.out.printf("%d개를 구매했습니다.\n", value);
        lottoList.getLottoNumber().forEach(System.out::println);
        System.out.println();
    }
}
