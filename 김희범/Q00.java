import java.util.*;
public class Q00
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int ary[] = new int[N];

        for(int i=0;i<N;i++)
        {
            ary[i] = scanner.nextInt();
        }

        Arrays.sort(ary);

        for(int i=0;i<N;i++)
        {
            System.out.println(ary[i]);
        }

        scanner.close();
    }
}
