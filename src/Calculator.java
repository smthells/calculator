import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) -> x / y; // может вылететь ArithmeticException,так как не учли возможное
    // деление на 0. Ниже приведены два способа решения проблемы: вывести 0 (divide2) или поймать исключение (divide3).

    BinaryOperator<Integer> divide2 = (x, y) -> y != 0 ? x / y : 0;

    BinaryOperator<Integer> divide3 = (x, y) -> {
        if (y != 0) {
            return x / y;
        } else {
            throw new ArithmeticException("Ошибка! На ноль делить нельзя.");
        }
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
