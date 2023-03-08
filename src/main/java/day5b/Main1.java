package day5b;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("r = ");
        double r = in.nextInt();
        in.close();
        if(r <= 0){
            System.exit(0);
        }
        HinhTron hinhTron = new HinhTron(r);
        System.out.println("Chu vi: " + hinhTron.tinhChuVi());
    }
}
