package utils;

public class PiCalculator {

    public static double calculatePi(int numberOfBooks) {
        double pi = Math.PI;
        return pi * numberOfBooks;
    }

    public static void main(String[] args) {
        int books = 5;
        double result = calculatePi(books);
        System.out.println("Результат: " + result);
    }
}