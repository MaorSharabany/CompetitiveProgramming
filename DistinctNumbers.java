import java.util.*;

public class DistinctNumbers {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int[] num = new int[n];
		
		for(int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
		}
		
		System.out.println(solve(num));
		
		scanner.close();
		
		
	}
	
	
	public static int solve(int[] num) {
		
		Arrays.sort(num);
		
		int count = 1 ;
		
		for(int i = 1; i < num.length; i++) {
			if(num[i] != num[i-1]) count++;
		}
		return count;
	}

}
