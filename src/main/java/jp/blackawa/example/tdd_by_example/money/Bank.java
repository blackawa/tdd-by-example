package jp.blackawa.example.tdd_by_example.money;

public class Bank {
    Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}