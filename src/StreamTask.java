import java.util.stream.IntStream;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        int sum = IntStream.of(numbers).filter(x -> x % 2 == 0).map(d -> d*d).sum();
        return sum;
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        int[] sortedArray = IntStream.of(numbers).filter(x -> x % 2 != 0).sorted().toArray();
        return sortedArray;
    }
}
