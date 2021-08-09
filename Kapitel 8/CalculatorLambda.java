import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class CalculatorLambda {
    public static void main(String... args) {
        IntBinaryOperator addition = (a, b) -> a + b;
        IntBinaryOperator subtraction = (a, b) -> a - b;
        IntBinaryOperator division = (a,b) -> a/b;
        IntBinaryOperator multiplication = (a,b) -> a*b;
        IntUnaryOperator inc = a -> ++a;
        IntUnaryOperator dec = a -> --a;
        System.out.println("40 + 2 = " + addition.applyAsInt(40, 2));
        System.out.println("20 - 10 = " + subtraction.applyAsInt(20, 10));
        System.out.println("40 : 2 = " + division.applyAsInt(40, 2));
        System.out.println("20 x 10 = " + multiplication.applyAsInt(20, 10));
        System.out.println(""+inc.applyAsInt(10));
        System.out.println(dec.applyAsInt(10));

    }
}