package problemset01;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProblemSet01 {

    public static void main(String[] args) {

        /*
                1. Create and print a stream of fixed values
                Create a Stream<String> from Stream.of(...) containing "Red", "Green", "Blue" and print each using forEach
         */

        Stream.of("Red", "Green", "Blue").forEach(e -> System.out.print(e+" "));
        Stream.of("Red", "Green", "Blue").forEach(System.out::print);

        /*
                2. Infinite stream with generate
                Using Stream.generate, produce an infinite stream of random integers (0–100) and print the first 5.
         */
        System.out.println();

        List<Integer> infinite = Stream.generate(() -> new Random().nextInt(100)).limit(5)
                .collect(Collectors.toList());
        System.out.println(infinite);

        /*
                3. Infinite stream with iterate (classic)
                Print the first 10 powers of 2 (1, 2, 4, 8, ...) using Stream.iterate
         */

        List<Integer> powOf2s = Stream.iterate(1, n -> n * 2).limit(10)
                .collect(Collectors.toList());

        System.out.println(powOf2s);

        /*

        4. Bounded iterate (Java 9+)
           Print all powers of 3 that are less than 1000 using the 3-arg Stream.iterate(seed, predicate, next)
         */

        List<Integer> printAllPowOf3  = Stream.iterate(1, n -> n < 1000, n -> n * 3)
                .collect(Collectors.toList());
        System.out.println(printAllPowOf3);

        /*
               5. Convert an array to a Stream
                  Convert to IntStream and print the sum and the max.
         */

        int[] arr = {5, 3, 8, 1, 9, 2};
        int sumOfEle = Arrays.stream(arr).sum();
        Optional<Integer> maxOfEle = Arrays.stream(arr).boxed().max(Integer::compareTo);

        /*
                6. Even numbers
                   Filter only even numbers and collect into a List
         */

        List<Integer> nums = List.of(10, 15, 22, 33, 44, 55, 60, 71);

        List<Integer> evens = nums.stream().filter(n -> n%2==0)
                .collect(Collectors.toList());
        System.out.println(evens);


        /*
                7. Square of odd numbers
                Using the same nums, filter odd numbers and map each to its square.
         */

        List<Integer> oddSqrs = nums.stream().filter(n->n%2!=0)
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(oddSqrs);

        /*
                8. Sum of squares
                   Find the sum of squares of all numbers in nums using mapToInt + sum().
         */

        int sumOfSqrs = nums.stream().map(n->n*n).mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumOfSqrs);

        /*
                Count numbers divisible by 3 or 5
                Count how many numbers from 1–100 are divisible by 3 or 5.
         */

        List<Integer> nums2 = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());

        List<Integer> divBy3OR5 = nums2.stream().
                filter(n ->
                    (n%3==0 || n%5==0)
                )
                .collect(Collectors.toList());
        System.out.println(divBy3OR5);

        /*
                11. Running statistics
                Use IntStream.summaryStatistics() to get min, max, average, sum, count in one line.
         */

        int[] scores = {56, 78, 90, 45, 88, 67, 100};

        IntSummaryStatistics summaryStatistics = Arrays.stream(scores).summaryStatistics();
        System.out.println(summaryStatistics);

    }
}
