import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        String nums = scan.next();

        System.out.println(nums.chars().map(ch -> ch - '0').sum());

    }
}