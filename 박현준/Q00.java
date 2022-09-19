import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        ArrayList <Integer> num = new ArrayList<Integer>();
        for(int i=0;i<N;i++) {
           num.add(Integer.parseInt(br.readLine()));
        }
        
        Collections.sort(num);
        for(int i : num) {
            bw.write(i+"\n");
        }
        
        
        bw.flush();
		br.close();
		bw.close();
        
        
    }
    
}