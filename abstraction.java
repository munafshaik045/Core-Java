abstract class ATM {

    abstract void withdraw();

    void checkBalance() {
        System.out.println("Checking account balance...");
    }
}
class SBI extends ATM {
    @Override
    void withdraw() {
        System.out.println("Money withdrawn from SBI ATM");
    }
}
class abstraction {
    public static void main(String[] args) {
        SBI obj = new SBI();
        obj.withdraw();
        obj.checkBalance();
    }
}
