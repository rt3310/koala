import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        int max = arr.stream().max(Comparator.comparing(x -> x)).get();

        double result = arr.stream().mapToDouble(i -> i / (double) max * 100).average().getAsDouble();

        System.out.println(result);
    }
}
