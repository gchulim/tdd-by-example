package guru.springframework;

public class Franc {
    private int amount;
    public Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        Franc franc = (Franc) o;
        return amount == franc.amount;
    }

}
