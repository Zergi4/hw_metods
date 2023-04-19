import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void checkYear(int year) {
        if (year % 400 == 0) {
            System.out.println(year + " год является высокосным.");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является высокосным.");

        } else if (year % 4 == 0) {
            System.out.println(year + " год является высокосным.");
        } else {
            System.out.println(year + " год не является высокосным.");
        }
    }

    public static void task1() {
        checkYear(2023);
    }

    public static void checkOsAndYear(int os, int year) {
        int currentYear = LocalDate.now().getYear();
        if (year < currentYear) {
            System.out.print("Установите облегченную версию приложения ");
        } else {
            System.out.print("Установите обычную версию приложения ");
        }
        if (os == 0) {
            System.out.println("для IOS по ссылке");
        } else {
            System.out.println("для Android по ссылке");
        }
    }

    public static void task2() {
        checkOsAndYear(1, 2022);
    }

    public static void main(String[] args) {
        task1();
        task2();
    }
}
