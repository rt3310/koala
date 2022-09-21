import java.util.Arrays;
import java.util.Scanner;

public class Day02_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N,x,y;
        int [][]num;

        N=scanner.nextInt();
        num=new int[N][2];
 //       for (int i=0;i<N;i++)num[i]=new int[2];

        for (int i = 0; i < N; i++) {   //  좌표 저장
            x= scanner.nextInt();
            y= scanner.nextInt();
            num[i][0]=x;
            num[i][1]=y;
        }

        Arrays.sort(num, (e1, e2) -> {
            if(e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(num[i][0]+" "+num[i][1]);
        }
    }
}
