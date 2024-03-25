package P001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        String arr = br.readLine();

//        for (int i = 0; i < N; i++) {
//            result += Integer.parseInt(String.valueOf(arr.charAt(i)));
//        }

        for (char c : arr.toCharArray()) {
            result += Character.getNumericValue(c);
        }

        System.out.println(result);
    }
}
