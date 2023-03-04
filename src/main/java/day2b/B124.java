package day2b;

public class B124 {
    public static void main(String[] args) {
        // Test
        int[] testArr = { 1999, 3001, 2002, 2003, 2006};

        // Duyệt mảng
        // Chỉ cần tìm giá trị đầu tiên thoả mãn
        boolean check = false;
        for (int i = 0; i < testArr.length; i++) {
            if (testArr[i] % 2 == 0 && testArr[i] < 2004) {
                check = true;
                break;
            }
        }
        if(check){
            System.out.println("Có giá trị thoả mãn");
        }
        else{
            System.out.println("Không có giá trị thoả mãn");
        }
    }
}
