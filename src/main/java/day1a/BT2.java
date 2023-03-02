package day1a;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        float x, y, z;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap x, y, z: ");
        x = in.nextFloat();
        y = in.nextFloat();
        z = in.nextFloat();
        in.close();

        float tbc = (x + y + z) / 3;

        double tbn = Math.pow(x * y * z, 1.0 / 3);

        System.out.printf("TBC = %.3f, TBN = %.3f", tbc, tbn);

    }
}
