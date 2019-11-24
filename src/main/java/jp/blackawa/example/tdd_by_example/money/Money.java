package jp.blackawa.example.tdd_by_example.money;

class Money implements Expression {
    protected int amount;
    protected String currency;

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    Expression plus(Money addend) {
        return new Sum(this, addend);
    }

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    String currency() {
        return currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount
                && currency().equals(money.currency());
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }

    public Money reduce(Bank bank, String to) {
        return new Money(amount / bank.rate(currency, to), to);
    }
}