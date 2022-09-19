package koala_002;

import java.util.Scanner;

public class Main {
    private static int n;
    private static double[] score;
    private static double max=0;

    public static void input() {    //입력메서드
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        score = new double[n];

        for (int i = 0; i < n; i++) {
            score[i]=scanner.nextDouble();
        }

        searchMax();
    }

    public static void searchMax() {    // 최댓값찾기
        for (int i = 0; i < n; i++) {
            if(max<score[i])max=score[i];
        }
        avg();
    }

    public static void avg() {      //평균 구하는 메서드
        double sum=0;
        double avg;
        for (int i = 0; i < n; i++) {
            score[i]=score[i]/max*100;
            sum+=score[i];
        }
        avg=sum/n;
        System.out.println(avg);
    }

    public static void main(String[] args) {
        input();
    }
}
