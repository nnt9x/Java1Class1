package day3a;

public class Main {
    /*
    modifier returnType nameOfMethod (Parameter List) {
    // method body
    }
     */
    // Đề bài: viết 1 hàm có input: chuỗi bất kì -> in ra chuỗi viết hoa.
    // Tên hàm: inChuoiVietHoa()
    // Danh sách tham số (input): String s
    // Kết qủa trả về: void

    // Static: tĩnh -> phương thức thuộc lớp
    // Nếu ko có static -> phương thức thuộc đối tượng

    public static void inChuoiVietHoa(String s){
        System.out.println(s.toUpperCase());
    }

    public static void main(String[] args) {
        // Method - Phương thức - Hàm -> định nghĩa
        // Để sử dụng cần gọi đến hàm và truyền vào các tham số.
        inChuoiVietHoa("Hello");
        inChuoiVietHoa("hi");
    }

}
