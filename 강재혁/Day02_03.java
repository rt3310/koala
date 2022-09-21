import java.util.Scanner;

public class Day02_03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N,M, i, j,sum;
        int []num;

        N= scanner.nextInt();   //N입력
        num = new int[N+1];

        M = scanner.nextInt();   //M입력
        num[0]=0;
        for (int k = 1; k < N+1; k++) {   //N개의 숫자를 입력받아 누적합을 num에 저장
            num[k]=scanner.nextInt()+num[k-1];
        }

        for (int k = 0; k < M; k++) {
            i= scanner.nextInt();
            j= scanner.nextInt();
            System.out.println(num[j]-num[i-1]);
        }
    }
}