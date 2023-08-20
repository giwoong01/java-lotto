package lotto.domain;

import java.util.List;
import java.util.stream.Collectors;

public class LottoList {

    private final List<Lotto> lottoList;

    public LottoList(List<Lotto> lottoList) {
        this.lottoList = lottoList;
    }

    public List<List<Integer>> getLottoNumber() {
        return lottoList.stream()
                .map(Lotto::getNumbers)
                .collect(Collectors.toList());
    }

}
