import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int nLen = (int)(Math.log10(N))+1;
		Integer[] nArr = new Integer[nLen];
		
		for(int i = 0; i < nLen; i++) {
			nArr[i] = N % 10;
			N = N / 10;
		}
		
		Arrays.sort(nArr, Collections.reverseOrder());
		
		for(int i = 0; i < nArr.length; i++) {
			System.out.print(nArr[i]);
		}
		
	}
}