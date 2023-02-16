package study.chap4.apst;

public class Snake extends Animal {
    public static int legCount = 0;

    int getMyLegCount() {
        return Snake.legCount;
    }

    void sayMyLegCount() {
        System.out.println("다리 개수 : " + this.getMyLegCount());
    }
    @Override
    void sayWhoIAm() {
        System.out.println("저는 뱀입니다.");
    }
}
