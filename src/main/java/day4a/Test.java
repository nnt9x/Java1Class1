package day4a;

import day4a.donggoi.Student;

public class Test {
    public static void main(String[] args) {
        Student s2 = new Student();
        // s2.id, s2.name => ko the truy cap do nam ngoai package
        s2.age = 21;
    }
}
