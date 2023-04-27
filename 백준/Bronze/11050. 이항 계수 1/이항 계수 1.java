import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int top = 1;
		int bot = 1;
		
		int kCnt = K;
		
		for (int i = 1; i <= kCnt; i++) {
			top = top * N;
			N--;
			
			bot = bot * K;
			K--;
		}
		System.out.println(top/bot);
	}
}