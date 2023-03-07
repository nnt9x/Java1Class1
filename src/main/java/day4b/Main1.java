package day4b;

public class Main1 {
    public static void main(String[] args) {
        // Tao ra doi tuong Engineer
        Engineer e = new Engineer(1, "Engineer 1");
        e.setAddress("HN");
        e.setDepartment("BKACAD");
        e.getSalary();

        System.out.println(e);

        Sale s = new Sale(2, "Sale 2");
        s.setRegion("ABC");
        s.setCommission("10000");
        s.setAddress("HN");

        System.out.println(s);

    }
}
