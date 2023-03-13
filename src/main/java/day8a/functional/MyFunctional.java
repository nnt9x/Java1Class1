package day8a.functional;


@FunctionalInterface
public interface MyFunctional {
    // Functional Interface chỉ chứa 1 phương thức trừu tượng
    // Đánh dấu là functional Interface bằng Anotation
    double calculator(double a, double b);
}
