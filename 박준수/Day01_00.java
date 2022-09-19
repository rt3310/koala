
import java.util.Arrays;
import java.util.Scanner;

public class Day01_00 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int num[] = new int[count];
		
		for(int i = 0; i < count; i++) {
			num[i] = scanner.nextInt();
		}
		Arrays.sort(num);
		for(int i = 0; i < count; i++) {
			System.out.println(num[i]);
		}
		
		scanner.close();
	}


}


