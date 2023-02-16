package study.chap4.apst;

public abstract class Animal {
    abstract int getMyLegCount();

    abstract void sayMyLegCount();
    void sayWhoIAm() {
        System.out.println("저는 동물입니다.");
    }
}
