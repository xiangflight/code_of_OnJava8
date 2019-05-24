package chapter5;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019-05-24 13:50
 */

public class PuttingIntoPractice {

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 3000),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        // 1
        transactions.stream().filter(d -> Objects.equals(2011, d.getYear()))
                            .sorted(Comparator.comparing(Transaction::getValue))
                            .collect(Collectors.toList())
                            .forEach(System.out::println);

        // 2
        Set<String> cities = transactions.stream().map(transaction -> transaction.getTrader().getCity())
                                                    .collect(Collectors.toSet());
        System.out.println(cities);

        // 3
        List<Trader> traders = transactions.stream().map(Transaction::getTrader)
                                                    .filter(trader -> Objects.equals("Cambridge", trader.getCity()))
                                                    .distinct()
                                                    .sorted(Comparator.comparing(Trader::getName))
                                                    .collect(Collectors.toList());
        System.out.println(traders);

        // 4
        String traderStr = transactions.stream().map(transaction -> transaction.getTrader().getName())
                                                .distinct()
                                                .sorted()
                                                .collect(Collectors.joining());
        System.out.println(traderStr);

        // 5
        boolean milanBased = transactions.stream().anyMatch(transaction -> Objects.equals("Milan", transaction.getTrader().getCity()));
        System.out.println(milanBased);

        // 6
        transactions.stream().filter(transaction -> Objects.equals("Cambridge", transaction.getTrader().getCity()))
                            .map(Transaction::getValue)
                            .forEach(System.out::println);

        // 7
        Optional<Integer> highestValue = transactions.stream().map(Transaction::getValue).reduce(Integer::max);
        highestValue.ifPresent(System.out::println);

        // 8
        Optional<Transaction> smallestTransaction = transactions.stream().reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
        smallestTransaction.ifPresent(System.out::println);

        // 9
        Optional<Transaction> smallestTransaction2 = transactions.stream().min(Comparator.comparing(Transaction::getValue));
        smallestTransaction2.ifPresent(System.out::println);
    }

}
