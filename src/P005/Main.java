package P005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] sum = new long[N];
        long[] mod = new long[M];
        long result = 0;

        st = new StringTokenizer(br.readLine());
        sum[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++) {
            sum[i] = sum[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            int remainder = (int) (sum[i] % M);

            if(remainder == 0) result++;

            mod[remainder]++;
        }

        for (int i = 0; i < M; i++) {
            if (mod[i] > 1) {
                result = result + (mod[i] * (mod[i] - 1) / 2);
            }
        }
        System.out.println(result);
    }
}
