import java.util.Arrays;

public class SortierWrapper {
    public static void main(String[] args) {

        Integer[] a = {2000, 2, 45, 34, 100000, 345, 56,
                78, 99, 756, 999, 0, 666, 2345, 7492, 22};

        for (Integer i = 0; i < a.length - 1; i++) {

            for (Integer j = 1; j < a.length - i; j++) {

                if (a[j - 1] > a[j]) {
                    Integer temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
