package HomeWork.Calculator;

public class Calculator {
    private double memoryValue = 0;


    public Calculator(){

    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }


    public static double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argument 'b' is 0");
        }
        return a / b;
    }


    public void clearMemoryValue() {
        this.memoryValue = 0;
    }

    public void addMemoryValue(double value) {
        this.memoryValue += value;
    }

    public void subMemoryValue(double value) {
        this.memoryValue -= value;
    }

    public double getMemoryValue() {
        return memoryValue;
    }
}
