import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder result = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int nSize = Integer.parseInt(st.nextToken());
        int caseSize = Integer.parseInt(st.nextToken());
        int arr[][] = new int[nSize+1][nSize+1];
        int arrTotal[][] = new int[nSize+1][nSize+1];

        for (int i = 1; i <= nSize; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= nSize; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                arrTotal[i][j] = arr[i][j] + arrTotal[i-1][j]  + arrTotal[i][j-1] - arrTotal[i-1][j-1];
            }
        }

        for (int i = 0; i < caseSize; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int value = arrTotal[x2][y2] - arrTotal[x2][y1-1] - arrTotal[x1-1][y2] + arrTotal[x1-1][y1-1];
            result.append(value);
            result.append("\n");

        }

        bw.write(result.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}
