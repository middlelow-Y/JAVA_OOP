package study.chap4.apst;

public class Mouse extends Animal {
    public static int legCount=4;

    int getMyLegCount() {
        return Mouse.legCount;
    }

    void sayMyLegCount() {

        System.out.println("다리 개수 : " + this.getMyLegCount());
    }
    @Override
    void sayWhoIAm() {
        System.out.println("저는 쥐입니다.");
    }
}
