import java.util.Arrays;
import java.util.Scanner;

public class Day01_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		double num[] = new double[count];
		
		for(int i = 0; i < count; i++) {
			num[i] = scanner.nextDouble();
		}
		
		Arrays.sort(num);
		
		double sum = 0;
		for(int i = 0; i < count; i++) {
			num[i] = num[i]/num[count-1]*100;
			sum = sum + num[i];
		}
		
		double avg = sum/count;
		System.out.print(avg);
	}

}
