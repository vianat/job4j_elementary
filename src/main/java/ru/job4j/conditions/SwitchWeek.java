package ru.job4j.conditions;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1 :
                name = "пн";
                break;
            case 2:
                name = "вт";
                break;
            case 3:
                name = "ср";
                break;
            case 4:
                name = "чт";
                break;
            case 5:
                name = "пт";
                break;
            case 6:
                name = "сб";
                break;
            case 7:
                name = "вс";
                break;
            default:
                name = "error";
                break;
        }
        return name;
    }

    public static void main(String[] args) {
        System.out.println(nameOfDay(1));
        System.out.println(nameOfDay(2));
        System.out.println(nameOfDay(3));
        System.out.println(nameOfDay(4));
        System.out.println(nameOfDay(5));
        System.out.println(nameOfDay(6));
        System.out.println(nameOfDay(7));
        System.out.println(nameOfDay(8));
        System.out.println(nameOfDay(0));
    }
}
