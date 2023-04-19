import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[][] a = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			String[] st;
			
			st = br.readLine().split(" ");
			
			a[i][0] = Integer.parseInt(st[0]);
			a[i][1] = Integer.parseInt(st[1]);
		}
		
		for (int i = 0; i < N; i++) {
			int k = 1;
			
			for (int j = 0; j < N; j++) {
				if (i == j) continue;
				
				if (a[i][0] < a[j][0] && a[i][1] < a[j][1]) {
					k++;
				}
			}
			System.out.print(k + " ");
		}
		
		
		
		System.out.println();
	}
}