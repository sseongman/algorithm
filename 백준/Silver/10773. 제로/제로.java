import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		int sum = 0;
		
		Stack<Integer> stk = new Stack<Integer>();
		
		for (int i = 0; i < K; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if (num == 0) {
				stk.pop();
			} else {
				stk.push(num);
			}
		}
		
		for (int a : stk) {
			sum = sum + a;
		}
		
		System.out.println(sum);
	}
}