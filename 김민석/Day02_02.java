import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Day02_02 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n,i;
        n=scanner.nextInt();
        int coordinate[][]=new int[n][2];
        for(i=0;i<n;i++){
            coordinate[i][0]=scanner.nextInt();
            coordinate[i][1]=scanner.nextInt();
        }
        Arrays.sort(coordinate,new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0])
                    return o1[1]-o2[1];
                else
                    return o1[0]-o2[0];
            }
        });
        for(i=0;i<n;i++){
            System.out.print(coordinate[i][0]+" ");
            System.out.println(coordinate[i][1]);
        }
    }
}