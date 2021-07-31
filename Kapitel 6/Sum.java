import java.util.Arrays;
import java.util.List;

public class Sum {
	
	public static double sumOfList(List<? extends Number> list) {
	    double s = 0.0;
	    for (Number n : list)
	        s += n.doubleValue();
	    return s;
	}
	
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(4, 6, 88, 99);
		
		System.out.println(sumOfList(l));		
	}

}
