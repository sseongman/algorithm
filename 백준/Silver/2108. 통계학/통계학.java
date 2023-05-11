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
		
		int cnt = Integer.parseInt(br.readLine());
		int[] nums = new int[cnt];
		
		double sum = 0;
		
		for (int i = 0; i < cnt; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			sum += nums[i];
		}
		
		Arrays.sort(nums);
		
		int count = 0;
		int max = -1;
		int mod = nums[0];
		
		boolean check = false;
		// 11 123
		//최빈값
		for (int i = 0; i < cnt-1; i++) {
			if (nums[i] == nums[i+1]) {
				count++;
			} else {
				count = 0;
			}
			
			if (max < count) {
				max = count;
				mod = nums[i];
				check = true;
			} else if (max == count && check == true) {
				mod = nums[i];
				check = false;
			}
		}
		System.out.println(Math.round(sum / cnt));
		System.out.println(nums[(cnt-1) / 2]);
		System.out.println(mod);
		System.out.println(nums[cnt-1] - nums[0]);
	}
}