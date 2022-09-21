import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int N;      //입력받을 정수의 갯수
    private static int []num;   //정수 저장 배열
    public static void print(){        //출력 메소드
        for (int i=0;i<N;i++) {
            System.out.println(num[i]);
        }
    }

    public static void sort(int []num){        //정렬 메소드
        Arrays.sort(num);
        print();
    }

    public static void input(){        //입력 메소드
        N=scanner.nextInt();
        num=new int[N];   //수를 저장할 배열

        for (int i=0;i<N;i++) {
            num[i]=scanner.nextInt();
        }
        sort(num);
    }

    public static void main(String[] args) {
        input();
    }

}
