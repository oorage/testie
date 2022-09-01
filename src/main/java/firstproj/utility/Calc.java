package firstproj.utility;

import java.util.Scanner;

/**
 * @author subsubsubx
 */

public class Calc {

    public double addition(double val1, double val2) {
        return val1 + val2;
    }

    public double subtraction(double val1, double val2) {
        return val1 - val2;
    }

    public double multiplication(double val1, double val2) {
        return val1 * val2;
    }

    public double division(double val1, double val2) {
        return val1 / val2;
    }

    public void calculation(){
        double val1, val2;
        Scanner scanner = new Scanner(System.in);
        // Считаем числа с консоли
        System.out.println("Введите 1е число");
        val1 = scanner.nextDouble();
        System.out.println("Введите 2е число");
        val2 = scanner.nextDouble();
        // Выбор операции
        String operation;
        System.out.println("Выберите операцию: +, -, /, *");
        operation = scanner.next();
        if (val2 == 0 && operation.equals("/")) {
            System.out.println("Делить на 0 нельзя!\nПопобобуйте еще раз");
            calculation();
        } else {
            switch (operation) {
                case "+" -> System.out.printf("Сумма равна %.4f", addition(val1, val2));
                case "-" -> System.out.printf("Разность равна %.4f", subtraction(val1, val2));
                case "*" -> System.out.printf("Произведение равно %.4f", multiplication(val1, val2));
                case "/" -> System.out.printf("Частное равно %.4f", division(val1, val2));
            }
        }
    }
}