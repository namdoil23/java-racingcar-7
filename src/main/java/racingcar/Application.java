package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 (,)을 기준으로 구분)");
        String name = InputName.inputCarName();
        // 입력 문자열을 구분자(쉼표)로 분리
        String[] items = name.split(",");

    }
}

