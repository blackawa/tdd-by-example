package jp.blackawa.example.tdd_by_example.money;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Pair, Integer> rates = new HashMap<>();

    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }

    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    int rate(String from, String to) {
        if (from.equals(to)) return 1;
        return rates.get(new Pair(from, to));
    }
}