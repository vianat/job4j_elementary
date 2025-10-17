package ru.job4j.calculator;

public class Fit {

    /**
     * Calculates ideal weight using Broca formula.
     *
     * @param height person's height in centimeters
     * @param isMale true if male, false if female
     * @return ideal weight in kilograms
     */
    public static double idealWeight(int height, boolean isMale) {
        if (height < 100 || height > 250) {
            throw new IllegalArgumentException("Height must be between 100 and 250 cm");
        }
        int correction = isMale ? 100 : 110;
        return (height - correction) * 1.15;
    }

    public static void main(String[] args) {
        int heightMan = 187;
        int heightWoman = 170;

        double man = idealWeight(heightMan, true);
        double woman = idealWeight(heightWoman, false);

        System.out.printf("Man height %d cm -> ideal weight: %.1f kg%n", heightMan, man);
        System.out.printf("Woman height %d cm -> ideal weight: %.1f kg%n", heightWoman, woman);
    }
}
