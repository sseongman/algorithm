import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] sArr = new String[N];
		
		for(int i = 0; i < N; i++) {
			sArr[i] = br.readLine();
		}
		
		Arrays.sort(sArr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} else {
					return s1.length() - s2.length();
				}
			}
		});
		
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(sArr[0]).append('\n');
		
		for(int i = 1; i < N; i++) {
			if(!sArr[i].equals(sArr[i-1])) {
				sb.append(sArr[i]).append('\n');
			}
		}
		System.out.println(sb);
	}
}