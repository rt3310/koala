import java.util.*;
public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String input = scanner.next();
        int sum = 0;

        for(int i=0;i<N;i++){
            char num = input.charAt(i);
            sum += (num-'0');
        }

        System.out.println(sum);

    }
}
