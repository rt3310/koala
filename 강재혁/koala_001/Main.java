package koala_001;

import java.util.Scanner;

public class Main {
    private static int n;      //입력받을 숫자의 갯수
    private static char[]num;   //숫자를 저장할 배열
    private static int sum;     //숫자의 총 합

    public static void input() {    //입력메소드
        Scanner scanner = new Scanner(System.in);

        n= scanner.nextInt();
        num=new char[n];

        String pre = scanner.next();    //String타입에 임시저장
        num=pre.toCharArray();      //char배열로 변환

        sum();
    }

    public static void sum() {      //덧셈 메소드
        for (int i=0;i<n;i++)
            sum+=num[i]-48;

        System.out.println(sum);
    }

    public static void main(String[] args) {
        input();
    }

}
