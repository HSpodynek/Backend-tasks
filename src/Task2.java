import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a list of integers separated by spaces:");
        String inputLine = scanner.nextLine();
        String[] inputStrings = inputLine.split("\\s+");
        List<Long> input = new ArrayList<>();

        for (String s : inputStrings) {
            input.add(Long.parseLong(s));
        }

        long targetSum = 13;
        List<long[]> pairs = findPairs(input, targetSum);

        for (long[] pair : pairs) {
            System.out.println(pair[0] + " " + pair[1]);
        }

        scanner.close();
    }

    private static List<long[]> findPairs(List<Long> numbers, long targetSum) {
        List<long[]> pairs = new ArrayList<>();
        Map<Long, Long> numberOccurrences = new HashMap<>();

        for (long number : numbers) {
            numberOccurrences.put(number, numberOccurrences.getOrDefault(number, 0L) + 1);
        }

        Set<String> addedPairs = new HashSet<>();

        for (long number : numbers) {
            long complement = targetSum - number;
            if (numberOccurrences.containsKey(complement)) {
                String pairKey = Math.min(number, complement) + ":" + Math.max(number, complement);
                if (!addedPairs.contains(pairKey)) {
                    pairs.add(new long[]{Math.min(number, complement), Math.max(number, complement)});
                    addedPairs.add(pairKey);
                }
            }
        }

        pairs.sort(Comparator.comparingLong(a -> a[0]));
        return pairs;
    }
}
