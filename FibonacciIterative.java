public class FibonacciIterative implements Fibonacci {
	public int fibonacci(int n) {
		if (n < 0) {
			return -1;
		}
		int num = 0;
		int other = 0;
		int other2 = 1;
		for (int i = 0; i < n; i++) {
			num = other + other2;
			int temp = other;
			other = num;
			other2 = temp;
		}
		return num;
	}

}