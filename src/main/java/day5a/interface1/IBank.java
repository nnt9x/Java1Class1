package day5a.interface1;

public interface IBank {
    int credit(int amount);
    int debit(int amount);
    int transferTo(Account account, int amount);

}
