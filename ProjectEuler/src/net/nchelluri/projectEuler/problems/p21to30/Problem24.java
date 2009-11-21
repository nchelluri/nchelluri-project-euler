package net.nchelluri.projectEuler.problems.p21to30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem24 {
	static int perms = 0;

	public static void main(String[] args) {
		long time = System.currentTimeMillis();

		List<Integer> pool = new ArrayList<Integer>();
		pool.add(0);
		pool.add(1);
		pool.add(2);
		pool.add(3);
		pool.add(4);
		pool.add(5);
		pool.add(6);
		pool.add(7);
		pool.add(8);
		pool.add(9);
		List<List<Integer>> permutations = permute(pool);
		System.out.println(permutations.get(999999));

		System.out.println("Execution time: "
				+ (System.currentTimeMillis() - time) + "ms");
	}

	protected static List<List<Integer>> permute(List<Integer> pool) {
		List<List<Integer>> retVal = new ArrayList<List<Integer>>();

		if (pool.size() == 2) {
			int first = pool.get(0);
			int second = pool.get(1);

			if (first < second) {
				List<Integer> firstPerm = new ArrayList<Integer>();
				firstPerm.add(first);
				firstPerm.add(second);
				retVal.add(firstPerm);

				List<Integer> secondPerm = new ArrayList<Integer>();
				secondPerm.add(second);
				secondPerm.add(first);
				retVal.add(secondPerm);
			} else {
				System.out.println("wenis");
				List<Integer> firstPerm = new ArrayList<Integer>();
				firstPerm.add(second);
				firstPerm.add(first);
				retVal.add(firstPerm);

				List<Integer> secondPerm = new ArrayList<Integer>();
				secondPerm.add(first);
				secondPerm.add(second);
				retVal.add(secondPerm);
			}
		} else {
			if (perms >= 1000000) {
				return retVal;
			}
			Collections.sort(pool);
			for (int i = 0; i < pool.size(); i++) {
				List<Integer> subList = new ArrayList<Integer>(pool);
				subList.remove(i);
				List<List<Integer>> subPermutations = permute(subList);
				for (List<Integer> subPermutation : subPermutations) {
					subPermutation.add(0, pool.get(i));
					retVal.add(subPermutation);
					if (pool.size() == 10) {
						perms++;
					}
				}
			}
		}

		return retVal;
	}
}
