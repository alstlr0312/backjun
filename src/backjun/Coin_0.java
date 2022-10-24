package backjun;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Coin_0 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] c = new int[N];
        int count = 0;

        for(int i = 0; i < N; i++) {
            c[i] = Integer.parseInt(br.readLine());
        }

        for(int i = N-1; i>=0; i--){
            if(c[i]<=K){
                count += (K / c[i]);
                K = K % c[i];
            }
        }
        System.out.println(count);
    }
}
