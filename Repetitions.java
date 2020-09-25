import java.util.*;

public class Repetitions {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		
		System.out.println(solve(str));
		
		
	}
	
	public static int solve(String str) {
		
		char[] s  = str.toCharArray();
		
		int [] count = new int[s.length];
		
		char c;
		int max = 0;
		
		int m = s.length/2;
		
		for(int i = 0; i < s.length; i++) {
			
			c = s[i];
			
			for(int j = i; j < s.length; j++) {
				
				if(s[j] == c) {
					
					count[i]++;
					if(count[i] >= max) max = count[i];
				
					if(count[i] >=  m) {
						
						if(s[j] != c) return count[i];
					}
				}else break;
		
			}
		}
		
		return max;
	}

}
