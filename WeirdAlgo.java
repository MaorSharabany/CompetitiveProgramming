import java.util.*;
import java.lang.*;
import java.io.*;


public class WeirdAlgo {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		long n = scanner.nextLong();
		
		solve(n);
	}
	
	public static void solve(long n) {
		
		int mod = (int)Math.pow(10, 9) + 7;
		
		System.out.print(n);
		
		while(n>1) {
		
			if(n % 2 == 0) {
				n = n / 2;
				System.out.print(" " + n);
				
			}else {				
					n = n*3 + 1;
					System.out.print(" " + n);
			}
		}
	}
}
		
		

