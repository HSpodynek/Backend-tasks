import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.LongStream;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a list of integers separated by spaces:");
        String input = scanner.nextLine();

        processInput(input);

        scanner.close();
    }

    private static void processInput(String input) {
        long[] numbers = Arrays.stream(input.split("\\s+"))
                .mapToLong(Long::parseLong)
                .toArray();
        Set<Long> distinctNumbers = new HashSet<>();
        for (long number : numbers) {
            distinctNumbers.add(number);
        }

        long[] sortedDistinctNumbers = distinctNumbers.stream()
                .mapToLong(Long::longValue)
                .sorted()
                .toArray();

        LongStream.of(sortedDistinctNumbers).forEach(number -> System.out.print(number + " "));
        System.out.println();
        System.out.println("count: " + numbers.length);
        System.out.println("distinct: " + distinctNumbers.size());
        System.out.println("min: " + sortedDistinctNumbers[0]);
        System.out.println("max: " + sortedDistinctNumbers[sortedDistinctNumbers.length - 1]);
    }
}
