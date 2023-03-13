package day8b;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.5);
        numbers.add(5.8);

        // Duyệt list và in ra giá trị của biêủ thức sau
        // y = 3x^2 + 5x -1 (trong đó x là các số trong list numbers)
        Consumer<Double> y = x -> {
            double y1 = 3 * x * x + 5 * x - 1;
            System.out.println(y1);
        };

        for (double n : numbers) {
            y.accept(n);
        }
        // Tăng giá trị của number lên gấp đôi
        Consumer<List<Double>> f = doubles -> {
            for (int i = 0; i < doubles.size(); i++) {
                doubles.set(i, 2 * doubles.get(i));
            }
        };
        System.out.println("Number: " + numbers);
        f.accept(numbers);

        System.out.println("Number: " + numbers);




    }
}
