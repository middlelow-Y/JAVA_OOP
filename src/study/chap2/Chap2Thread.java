package study.chap2;

/**
 * Multi-Thread : T메모리 구조 상에서 stack 영역을 분리하여 사용(메모리 절약 가능, static 영역 공유)
 * Multi-Process : T 메모리 자체를 분리하여 사용(메모리 사용량 증가, static 영역을 공유하지 않아 안정성 높음)
 */
public class Chap2Thread extends Thread {
    static int share;

    public static void main(String[] args) {
//        int i;
//        i = 5;
//        System.out.println("i 값은 : " + i + " 입니다.");
        Chap2Thread c1 = new Chap2Thread();
        Chap2Thread c2 = new Chap2Thread();

        c1.start();
        c2.start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(share++);

            try {
                sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
