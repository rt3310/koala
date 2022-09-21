import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException; 

public class Day02_03 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
		 StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //Int
		int M = Integer.parseInt(st.nextToken()); //Int
		int Array[] = new int[N+1];
		
		st = new StringTokenizer(bf.readLine());
		for(int i = 1; i <=N; i++) {
			Array[0] = 0;
			Array[i] = Array[i-1] + Integer.parseInt(st.nextToken()); //Int
		}
		
		int start, last;

		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(bf.readLine());
			start = Integer.parseInt(st.nextToken()); //Int
			last = Integer.parseInt(st.nextToken()); //Int
			bw.write(Array[last]-Array[start-1] + "\n");
			
		}
		bw.flush();   //남아있는 데이터를 모두 출력시킴
		bw.close();   //스트림을 닫음

	}

}
