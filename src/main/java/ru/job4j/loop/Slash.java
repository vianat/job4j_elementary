package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = row >= cell;
                boolean right = row >= cell;
                if (left) {
                    System.out.print("x");
                } else if (right) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    // x x x x
    // x x x x
    // x x x x
    // x x x x

    public static void draw2(int size) {
        if (size > 1 & size % 2 < 1) {
            System.out.print("x");

            for (int x = 0; x < size; x++) {
                for (int y = 0; y < size; y++) {

                    if (x % 2 != 1  & y % 2 != 1) {
                        System.out.print(" ");
                        } else {
                            System.out.print("x");
                        }
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.println("Draw by 4");
        draw2(2);
    }
}
