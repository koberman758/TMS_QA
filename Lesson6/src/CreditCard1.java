public class CreditCard1 {
    public int cardNumber;
    public float currentBalance;

    public CreditCard1() {
    }

    public CreditCard1(int cardNumber, float currentBalance) {
        this.cardNumber = cardNumber;
        this.currentBalance = currentBalance;

    }

    public float deposit(float b) {
        return currentBalance += b;
    }

    public float withdraw(float b) {
        return currentBalance -= b;
    }


    public String toString() {
        return "Номер карты: " + cardNumber + ", Баланс карты: " + currentBalance + ".";
    }
}
