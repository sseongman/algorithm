import java.io.IOException;

public class Main {
	public static void main(String arg[]) throws IOException {
		
		boolean[] chk = new boolean[10001];
		
		for (int i = 1; i <= 10000; i++) {
			int n = d(i);
			
			if (n <= 10000) {
				chk[n] = true;
			}
		}
		
		for (int i = 1; i <= 10000; i++) {
			if (!chk[i]) {
				System.out.println(i);
			}
		}
	}
	
	public static int d(int num) {
		int sum = num;
		
		while(num != 0) {
			sum = sum + (num % 10);
			num = num/10;
		}
		
		return sum;
	}
}