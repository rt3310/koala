import java.util.Scanner;

public class Day01_02 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N,i;

        int sum=0;
        N=scanner.nextInt();
        if(N<1||N>100) System.exit(0);
        String arrayNumber =scanner.next();
        char[] num=arrayNumber.toCharArray();

        for(i=0;i<N;i++)
        {
            sum+=num[i]-48;
        }

        System.out.println(sum);
        scanner.close();
    }
}