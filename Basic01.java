package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Basic01 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int result = 0;
		
		st = new StringTokenizer(bf.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		
		result = a - 543;
		
		bw.write(result + "\n");
		
		bw.flush();
		bw.close();
	}
}
