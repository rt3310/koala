import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class Day02_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();				// 행
		int XY[][] = new int [N][2];		//x,y 좌표 2열
		
		for(int i = 0; i < N; i++) {
			XY[i][0] = scan.nextInt();
			XY[i][1] = scan.nextInt();
		}

		Arrays.sort(XY, new Comparator<int[]>() {		
			@Override
			public int compare(int[] e1, int[] e2) {
				if(e1[0] == e2[0]) {		// 첫번째 원소(x)가 같다면 두 번째 원소(y)끼리 비교
					return e1[1] - e2[1];	// y좌표 오름차순 정렬
				}
				else {						// 첫번째 원소(x)가 다르면 x좌표 오름차순 정렬
					return e1[0] - e2[0];
				}
			}
		});
		
		for(int i = 0; i < N; i++) {
			System.out.println(XY[i][0] + " " + XY[i][1]);
		}
		
	}
}
