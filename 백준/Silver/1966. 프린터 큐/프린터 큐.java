import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		
		
		for (int i = 0; i < T; i++) {
			StringTokenizer nm = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(nm.nextToken()); // 4
			int M = Integer.parseInt(nm.nextToken()); // 2
			
			int cnt = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			Queue<int[]> q = new LinkedList<>();
			
			for (int j = 0; j < N; j++) {
				q.offer(new int[] {j, Integer.parseInt(st.nextToken())});
			}
			
			while (true) {
				int[] now = q.poll();
				boolean flag = true;
				
				for (int[] arr : q) {
					if (arr[1] > now[1]) {
						flag = false;
						break;
					}
				}
				
				if(flag) {
					cnt++; //2 
					if (now[0] == M) break;
				} else {
					q.offer(now);
				}
			}
			System.out.println(cnt);
		}
	}
}