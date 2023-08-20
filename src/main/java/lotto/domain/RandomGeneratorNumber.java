package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class RandomGeneratorNumber implements GeneratorNumber{

    @Override
    public List<Integer> generatorNumber() {
        return Randoms.pickUniqueNumbersInRange(1, 45, 6);
    }
}
