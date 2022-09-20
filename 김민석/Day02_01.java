import java.util.Scanner;
public class Day02_01 {
    static Scanner scanner=new Scanner(System.in);

    static void errorcheck(int n){
        if(n<1||n>100000)  System.exit(0);
    }

    public static void main(String[] args) {
        int N,M,i,temp,to,from;;
        N= scanner.nextInt();
        errorcheck(N);      //N조건확인
        M= scanner.nextInt();
        errorcheck(M);      //M조건확인
        int Nary[]=new int[N];           //숫자 N개 만큼 배열생성
        int sum[]=new int[M];
        for(i=0;i<N;i++){
            temp=scanner.nextInt();
            if(i==0){
                Nary[0]=temp;
            }
            else{
                Nary[i]=Nary[i-1]+temp;     //배열에 누적된 값 저장
            }
        }
        for(i=0;i<M;i++){
            to= scanner.nextInt();
            from=scanner.nextInt();
            if(to>from) System.exit(0);
            if(to==1){
                sum[i]=Nary[from-1];
            }
            else{
                sum[i]=Nary[from-1]-Nary[to-2];
            }
        }
        for(i=0;i<M;i++){
            System.out.println(sum[i]);
        }

    }
}