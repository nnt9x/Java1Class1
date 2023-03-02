package day1a;

public class Example1 {

    public static void main(String[] args) {
        // In ra Hello world
        // print line
        System.out.println("Hello world");
        // Thử đoạn mã sau và đưa nhận xét
        System.out.print("Welcome to ");
        System.out.print("Java");
        // Thử và đưa nhận xét
        String name = "BKACAD";
        int year = 2023;
        // Print format
        System.out.printf("Xin chào các bạn đến với khoá học tại %s vào %d", name, year);

        /*
        Tạo 2 biến lưu thông tin tên và năm sinh (2000)
        -> In ra tên và tuổi trên một dòng
        Gợi ý:
        String hoTen = "";
        int namSinh = 2000;
        int tuoi = 2023 - namSinh;
         */
        String hoTen = "Nguyen Van A";
        int namSinh = 2000;
        int tuoi = 2023 - namSinh;
        // souf
        // \n: new line
        // \t: tab
        System.out.printf("\nHọ tên: %s\tnăm nay %d tuổi", hoTen, tuoi);

    }
}
