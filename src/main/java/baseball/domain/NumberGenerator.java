package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {
    public List<Integer> createRandomNumbers() {
        List<Integer> RandomNumbers = new ArrayList<Integer>();
        while (RandomNumbers.size() < 3) {
            int number = new Random().nextInt(9) + 1;
            if (RandomNumbers.contains(number)) {
                continue;
            }
            RandomNumbers.add(number);
        }
        return RandomNumbers;
    }
}
