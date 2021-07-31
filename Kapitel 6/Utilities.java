public class Utilities {

	public static <T> T noNull(T... args) {

		for (T element : args) {
			if (element != null)
				return element;
		}
		return null;
	}

	public static <T extends Comparable<? super T>> void sortiere(T[] a) {
		// array sorting
		// loop to control number of passes
		for (int pass = 1; pass < a.length; pass++) {

			// loop to control number of comparisons
			for (int element = 0; element < a.length - 1; element++) {

				// compare side-by-side elements and swap them if
				// first element is greater than second element
				if (a[element].compareTo(a[element + 1]) > 0) {

					T temp; // temporary holding area for swap

					temp = a[element];
					a[element] = a[element + 1];
					a[element + 1] = temp;
				}

			} // end loop to control comparisons

		}
	}

	public static <T> void print(T[] a) {

		System.out.print("[");
		for (int i= 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length-1)
				System.out.print(",");
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		Integer[] array = 
				{ 2000, 2, 99, 756, 999,0, 666, 2345, 7492, 22 };
		String[] article = 
				{ "the", "a", "one", "some", "anton","ymca" };

		print(array);
		sortiere(array);
		print(array);

		print(article);
		sortiere(article);
		print(article);

		System.out.println(noNull(null, 23, 45, 56, null));
		System.out.println((Object)noNull());
		System.out.println(noNull(null, "Hello", "WoW"));

	}

}
