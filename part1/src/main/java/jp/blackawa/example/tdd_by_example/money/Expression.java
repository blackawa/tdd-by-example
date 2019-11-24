package jp.blackawa.example.tdd_by_example.money;

interface Expression {
    Expression plus(Expression addend);
    Expression times(int multiplier);
    Money reduce(Bank bank, String to);
}
