package jp.blackawa.example.tdd_by_example.money;

class Franc {
    private int amount;

    Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    public boolean equals(Object object) {
        Franc dollar = (Franc) object;
        return this.amount == dollar.amount;
    }
}
