import java.util.Scanner;
import java.util.Arrays;

public class Day01_01 {

    public static void main(String[] args) {
        int N,i;
        int numAry[];
        Scanner scanner = new Scanner(System.in);

        N=scanner.nextInt();
        if(N<1||N>1000)
            System.exit(0);
        numAry = new int[N];
        for(i=0;i<N;i++)
        {
            numAry[i]=scanner.nextInt();
        }

        Arrays.sort(numAry);
        for(i=0;i<N;i++)
        {
            System.out.println(numAry[i]);
        }


        scanner.close();


    }

}