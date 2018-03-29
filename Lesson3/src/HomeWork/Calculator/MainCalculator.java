package HomeWork.Calculator;

public class MainCalculator {

    public static void main(String[] args) {
        System.out.println(Calculator.mul(5, 10));
        System.out.println(Calculator.sum(5, 10));
        Calculator calc = new Calculator();
        calc.addMemoryValue(5);
        calc.addMemoryValue(6);
        calc.subMemoryValue(3);
        System.out.println(Calculator.sub(calc.getMemoryValue(), 2));
        calc.clearMemoryValue();
        calc.addMemoryValue(5);
        System.out.println(Calculator.div(10, calc.getMemoryValue()));

    }
}
