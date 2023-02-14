package study.chap2;

/**
 * 코드 실행에 따른 T메모리 구조 확인을 위한 실습
 */
public class Chap2 {
    public static void main(String[] args) {
        int i = 5;
        int j = 10;
        if (i < j) {
            System.out.println("i 보다 j가 크다.");
        }
        i = mul(i);
        j = mul(j);
        System.out.println(i + "  " + j);
    }
    private static int mul(int i) {
        i *= 2;
        return i;
    }
}


