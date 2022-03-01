package Day3Assign;

		import java.util.Iterator;

		import java.util.LinkedHashSet;

		import java.util.Scanner;

		public class MainJava {

		public static void main(String[] args) {

		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			int a[] = new int[n];

			for (int i = 0; i < n; i++) {

			a[i] = sc.nextInt();

			}

			System.out.println(sumOfEvenNos(a));
		}

		}

		public static int sumOfEvenNos(int[] a) {

		int sum = 0;

		LinkedHashSet<Integer> hm = new LinkedHashSet<Integer>();

		for (int i = 0; i < a.length; i++) {

		hm.add(a[i]);

		}

		Iterator<Integer> lm = hm.iterator();

		while (lm.hasNext()) {

		int b = lm.next();

		if (b % 2 == 0)

		sum = sum + b;

		}

		return sum;



		}



		}
