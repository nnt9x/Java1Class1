package day5a.interface1;

public class App {
    public static void main(String[] args) {
        IBank iBank = new VietcomBank();
        iBank.debit(1000);
    }
}
