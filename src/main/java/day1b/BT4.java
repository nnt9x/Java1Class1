package day1b;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x = ");
        int x = in.nextInt();
        in.close();

        double tmp = Math.sqrt(x); // 3.0
        int tmp1 = (int) tmp;      // 3
        if(tmp == tmp1){
            System.out.println("Là số chính phương");
        }
        else{
            System.out.println("Không là số chính phương");
        }
    }
}
