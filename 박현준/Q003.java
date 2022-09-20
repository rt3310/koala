import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder result = new StringBuilder();
        int numArrSize = Integer.parseInt(st.nextToken());
        int caseSize = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int total = 0;
        int arr[] = new int[numArrSize + 1];

        for (int i = 1; i <= numArrSize; i++) {
            total += Integer.parseInt(st.nextToken());
            arr[i] = total;
        }

        for (int i = 0; i < caseSize; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken());

            result.append(arr[end] - arr[start]);
            result.append("\n");
        }
        bw.write(result.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}
