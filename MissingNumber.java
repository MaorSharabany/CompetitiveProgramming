import java.util.*;
import java.lang.*;
import java.io.*;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int[] num = new int [n];
		
		for(int i = 0; i<n-1; i++) {
			num[i] = scanner.nextInt();
		}
		
		System.out.println(solve(n, num));
	}
	
	public static int solve(int n, int[] num) {
		
		Arrays.sort(num);
		
		for(int i = 1; i < n; i++) {
			if(num[i] != i) {
				if(num[i] > i) return i;
				break;
			}
		}
		return n;
	}
}
		
		
		
	