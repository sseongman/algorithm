import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		int[] num = new int[10];
		int tmp = 0;
		int max = 0;
		Arrays.fill(num, 0);
		
		for (int i = 0; i < N.length(); i++) {
			tmp = N.charAt(i) - '0';
			num[tmp]++;
		}
		
		int sum = num[6] + num[9];
		
		if (sum % 2 == 0) {
			num[6] = sum / 2;
			num[9] = sum / 2;
		} else {
			num[6] = sum / 2 + 1;
			num[9] = sum / 2 + 1;
		}
		
		for (int a : num) {
			max = Math.max(max, a);
		}
		
		System.out.println(max);
	}
}