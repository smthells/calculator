public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide2.apply(a, b);
        System.out.println(c);
        //или
        try {
            int d = calc.divide3.apply(a, b);
            calc.println.accept(d);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}