import java.util.Scanner;

public class Day01_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		String num = scanner.next();
		
		int sum = 0;
		
		for(int i = 0; i < count; i++) {
			char str = num.charAt(i);
			sum = sum + (str - '0');
		}
		System.out.print(sum);
		
		scanner.close();
	}
}
