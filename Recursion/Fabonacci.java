import java.util.*;

public class Fabonacci {
	static int Solution(int n) {
		// Fabonacci
		if (n <= 1) {
			return n;
		}
		return Solution(n - 1) + Solution(n - 2);
		// Also we can use this...
		/* 	int Flast = Solution(n-1);
			int Slast = Solution(n-2);
			return Flast + Slast;  
		*/
	}

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int n = scn.nextInt();
			System.out.print(Solution(n));
		}
	}
}
