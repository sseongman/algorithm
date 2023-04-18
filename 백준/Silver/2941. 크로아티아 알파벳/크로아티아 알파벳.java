import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		String str = br.readLine(); // ljes=njak
		
		for (String val : arr) {
			str = str.replace(val, "A");
		}
		
		System.out.println(str.length());
	}
}