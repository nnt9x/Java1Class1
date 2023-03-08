package day5a.interface1;

public class VietcomBank implements IBank{
    @Override
    public int credit(int amount) {
        // Chỉ có vietcombank
        return 0;
    }

    @Override
    public int debit(int amount) {
        return 0;
    }

    @Override
    public int transferTo(Account account, int amount) {
        return 0;
    }
}
