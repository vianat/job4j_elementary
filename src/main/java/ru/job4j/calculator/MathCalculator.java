package ru.job4j.calculator;

import ru.job4j.math.*;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double summOfTwo(double first, double second) {
        return MathFunction.devide(first, second)
                + MathFunction.deduction(first, second);
    }

    public static double summOfAllFour(double first, double second) {
        return MathFunction.deduction(first, second)
                + MathFunction.deduction(first, second)
                + MathFunction.multiply(first, second)
                + MathFunction.sum(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}
