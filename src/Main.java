// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void checkYear(int year) {
        if (year % 400 == 0) {
            System.out.println(year + " год является высокосным.");
        } else if (year % 100 == 0 ) {
            System.out.println(year + " год не является высокосным.");

        } else if (year % 4 == 0) {
            System.out.println(year + " год является высокосным.");
        } else {
            System.out.println(year + " год не является высокосным.");
        }
    }
    public static void main(String[] args) {
        checkYear(2023);
        }
    }
