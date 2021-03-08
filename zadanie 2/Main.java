package sample;
public class Main {
    public static void main(String[] args) {
        //banki
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();
        //printouty
        System.out.println("Bank A: "+a.getBalance()+"\nBank B: "+b.getBalance()+"\nBank C: "+c.getBalance());
    }
}
