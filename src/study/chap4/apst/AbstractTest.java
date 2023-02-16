package study.chap4.apst;

/**
 * 추상 class, mothod 실습
 * 동물 class에 다리 개수를 정의하는 것 자체가 잘못됨.
 * 따라서 추상 class와 method를 활용해 하위 class에서 구현을 강제하되 직접 변수 값을 지정하지는 않음
 */
public class AbstractTest {
    public static void main(String[] args) {
        Mouse mickey = new Mouse();
        Snake tom = new Snake();

        mickey.sayMyLegCount();
        tom.sayMyLegCount();
        mickey.sayWhoIAm();
        tom.sayWhoIAm();
    }
}
