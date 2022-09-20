import java.util.Scanner;

public class Q02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int scores[] = new int[N]; //실제 받은 성적

        for(int i=0;i<N;i++)
        {
            scores[i] = scanner.nextInt();
        }

        int Max = scores[0];

        for(int i=1; i<N; i++) //최대 성적 Max 찾기
        {
            if(Max < scores[i])
            {
                Max = scores[i];
            }
        }

        double new_scores[] = new double[N]; //조작된 점수

        for(int i=0; i<N; i++)
        {
            new_scores[i] = ((double)scores[i]/Max)*100;
        }


        double sum = 0; //조작된 점수의 합

        
        for(int i=0;i<N;i++)
        {
            sum = sum + new_scores[i];
        }

        double avg = (double)sum/N; //조작된 평균 점수

        System.out.println(avg);

    }
}
