package baseball;

import baseball.domain.NumberGenerator;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        final NumberGenerator numberGenerator = new NumberGenerator();
        System.out.println(numberGenerator.createRandomNumbers());
    }
}
