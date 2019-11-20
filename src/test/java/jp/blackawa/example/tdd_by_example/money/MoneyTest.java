package jp.blackawa.example.tdd_by_example.money;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
