public class FactorialIterative implements Factorial {
	public int factorial(int n) {
		if (n < 0) {
			return -1;
		}
		if (n == 0) {
			return 1;
		}
		int num = 1;
		for (int i = 1; i <= n; i++) {
			num *= i;
		}
		return num;
	}
	

}