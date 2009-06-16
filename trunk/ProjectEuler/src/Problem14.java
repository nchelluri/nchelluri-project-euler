public class Problem14 {
	public static void main(String[] args) {
		// n -> n/2 (n is even)
		// n -> 3n + 1 (n is odd)

		long time = System.currentTimeMillis();

		long max = 0;
		long store = 0;

		for (long i = 13; i < 1000000; i++) {
			int count = 0;
			long j = i;

			while (j != 1) {
				if (j % 2 == 0) {
					j = j / 2;
				} else {
					j = 3 * j + 1;
				}
				count++;
			}
			count++;

			if (count > max) {
				max = count;
				store = i;
			}
		}

		System.out.println(store + ": " + max);

		System.out.println("Execution time: "
				+ (System.currentTimeMillis() - time));
	}
}
