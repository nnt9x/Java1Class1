package day2b;

public class B125 {
    public static void main(String[] args) {
        int[] testArr = {1, 3, 5, 7, 9, 10, 20, 97};
        // 4 số
        int count = 0;
        for (int n : testArr) {
            if (n > 1) {
                boolean flag = true;
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    count++;
                }
            }
        }
        System.out.printf("Có tất cả %d số nguyên tố\n", count);
    }
}
