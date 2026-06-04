package org.example.Stream;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> myStream = list.stream();

        String[] array = {"apple", "banana", "cherry"};
        Stream<String> stream = Arrays.stream(array);

        Stream<Integer> newStream = Stream.of(1, 2, 3, 5);
        Stream.iterate(0, n -> n + 1).limit(100);

        Stream.generate(() -> "Hello").limit(5);


        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8324, 34, 42, 36, 546, 4);
        List<Integer> newList = list1.stream().filter(n -> n % 2 == 0).map(n -> n / 2).distinct().sorted((a, b) -> b - a).skip(1).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> collect = Stream.iterate(0, n -> n + 1).limit(100).skip(0).filter(n -> n % 2 == 0).map(n -> n / 10).distinct().collect(Collectors.toList());
        System.out.println(collect);

        Integer i = Stream.iterate(0, n -> n + 1).limit(101).skip(0).map(n -> n / 20).distinct().peek(System.out::println).max((a, b) -> a - b).get();
        System.out.println(i);
        Long u = Stream.iterate(0, n -> n + 1).limit(101).map(n -> n / 20).distinct().count();

        System.out.println(u);


        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate myDate = LocalDate.of(2000, 11, 20);
        System.out.println(myDate);
        int dayOfMonth = now.getDayOfMonth();
        Month month = now.getMonth();
        int year = now.getYear();
        System.out.println(dayOfMonth);
        System.out.println(month);
        System.out.println(year);

        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate yesterday = today.minusDays(1);
        System.out.println(yesterday);
        LocalDate nextDay = today.plusDays(1);
        System.out.println(nextDay);

        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);
    }
}
