package com.graymattter;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaExpressionsDemo {

    public static void main(String[] args) {
        // Task 1: Sort a String in Alphabetical Order
        String input = "lambdaexpressions";
        String sortedString = Arrays.stream(input.split(""))
                                    .sorted()
                                    .collect(Collectors.joining());
        System.out.println("Sorted String: " + sortedString);

        // Task 2: Find the Average of a List of Doubles
        List<Double> numbers = Arrays.asList(10.5, 15.5, 20.0, 25.5);
        double average = numbers.stream()
                                .mapToDouble(Double::doubleValue)
                                .average()
                                .orElse(0.0);
        System.out.println("Average: " + average);

        // Task 3: Check if a Number is Prime
        IntPredicate isPrime = num -> num > 1 && 
                                    IntStream.range(2, num)
                                             .noneMatch(divisor -> num % divisor == 0);
        int number = 17;
        boolean result = isPrime.test(number);
        System.out.println(number + " is prime: " + result);

        // Task 4: Concatenate Two Strings
        BiFunction<String, String, String> concatenate = (s1, s2) -> s1 + s2;
        String str1 = "Hello, ";
        String str2 = "World!";
        String concatenatedString = concatenate.apply(str1, str2);
        System.out.println("Concatenated String: " + concatenatedString);

        // Task 5: Count Strings in a Paragraph
        String paragraph = "This is a sample paragraph. It contains multiple words and sentences.";
        Function<String, Long> countStrings = text -> Arrays.stream(text.split("\\s+"))
                                                            .count();
        long wordCount = countStrings.apply(paragraph);
        System.out.println("Word Count: " + wordCount);
    }
}
