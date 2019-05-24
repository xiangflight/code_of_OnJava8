package chapter5;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-24 13:48
 */

public class Transaction {

    private Trader trader;
    private int year;
    private int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getValue() {
        return value;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "{" + trader +
                ", year: " + year +
                ", value: " + value +
                '}';
    }
}
