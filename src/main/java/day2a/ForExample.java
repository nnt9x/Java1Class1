package day2a;

public class ForExample {
    public static void main(String[] args) {
        // In ra cac so tu 1 -> 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        // In ra các số 1, 3, 5, 7, 9... 99
        for (int i = 1; i <= 99; i = i + 2) {
            System.out.print(i + "\t");
        }

        // Có bao nhiêu số lẻ trong khoảng (a, b)
        // Input: a, b - long (a < b)
        // Output: tổng số lẻ
        // VD: (1, 9) -> 3 5 7 giá trị phù hợp
    }
}
