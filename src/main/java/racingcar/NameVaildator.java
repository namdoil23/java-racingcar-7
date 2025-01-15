package racingcar;

import java.util.HashSet;
import java.util.Set;

public class NameVaildator {
    // 이름입력값이 비었는지 확인
    public static boolean validateName(String items) {
        return items == null || items.trim().isEmpty();
    }
    // 이름입력값이 다섯글자가 넘는지 확인
    public static boolean validateNameLength(String items) {
        return items.length() <= 5;
    }
    // 중복된 이름을 관리하기 위한 Set
    private static Set<String> itemsSet = new HashSet<>();

    // 이름을 검증하고 중복 여부를 반환하는 메서드
    public static boolean isNameDuplicate(String items) {
        if (itemsSet.contains(items)) {
            return true; // 이미 존재하는 이름
        }
        itemsSet.add(items); // 새로운 이름 추가
        return false;
    }

}
