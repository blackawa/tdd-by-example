package jp.blackawa.example.tdd_by_example.money;

interface Expression {
    Money reduce(Bank bank, String to);
}
