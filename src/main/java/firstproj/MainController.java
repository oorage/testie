package firstproj;

import firstproj.utility.*;
import firstproj.sweets.*;

import java.util.Map;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;


/**
 * @author subsubsubx
 */

public class MainController {
    public static void main(String[] args) {
        System.out.println("Выберите режим: 1 - калькулятор; 2 - поиск максимального слова в строке; " +
                " 3 - замена максимального и минимального элементов массива местами\n" +
                "4 - подарки; 5 - калькулятор ООП; 6 - чтение из файла");
        Scanner scanner = new Scanner(System.in);
        int mode = scanner.nextInt();
        if (mode == 1) {
            Calc calc = new Calc();
            calc.calculation();
        } else if (mode == 2) {
            MaxLength maxLength = new MaxLength();
            System.out.printf("Самое длинное слово: %s", maxLength.getMaxElement());
        } else if (mode == 3) {
            SwapElementsArray swap = new SwapElementsArray();
            swap.swap();
        } else if (mode == 4) {
            Donut donut1 = new Donut("Dunkin", 12.66, 120, "Damn big");
            Donut donut2 = new Donut();
            donut2.setTitle("Raspberry");
            donut2.setWeight(15.5);
            donut2.setPrice(1050.2);
            donut2.setSize("Mid");
            Candy candy1 = new Candy("Шипучки", 1.5, 120.5, "Roshen", 300);
            Candy candy2 = new Candy("Twix", 3.5, 3000, "Mars inc.", 600);
            Jellybean jellybean = new Jellybean("Skittles", 2.19, 75, "Классический");

            Sweets[] pack = {donut1, donut2, candy1, candy2, jellybean};

            System.out.println("Общая цена подарка = " + Sweets.getTotalPrice(pack));
            System.out.println("Общий вес подарка = " + Sweets.getTotalWeight(pack));

            for (Sweets tmp : pack) {
                System.out.println(tmp.toString());
            }
        } else if (mode == 5) {
            CalcOOP calculator = new CalcOOP();
            calculator.setVal1(-21);
            calculator.setVal2(2);
            calculator.setOp("*");
            System.out.println(calculator);

            CalcOOP cal1 = new CalcOOP(32.6, -2, "/");
            System.out.println(cal1);

            CalcOOP cal2 = new CalcOOP(123, 20, "-");
            double someResult = cal2.getResult();
            System.out.println(someResult);

            CalcOOP cal3 = new CalcOOP();
            cal3.setVal1(2.2);
            cal3.setVal2(3);
            cal3.setOp("*");
            System.out.println(cal3);

            CalcOOP cal4 = new CalcOOP();
            cal4.setVal1(100);
            cal4.setOp("+");
            try {
                System.out.println(cal4);
            } catch (Exception e) {
                System.err.println("Не заданы данные! val1 = " + cal4.getVal1() +
                        " val2 = " + cal4.getVal2() + " " + e);
            }
//            CalculatorOOP cal5 = new CalculatorOOP();
//            cal5.setVal1(111);
//            cal5.setVal2(2222);
//            //    Double someResult1 = cal5.getResult();
//            System.out.println(cal5);

            //    int asd = 21/0;
            //    System.out.println(asd);

            CalcOOP cal6 = new CalcOOP();

            System.out.println("Введите val1 operation val2:");
            double val1, val2;
            String op;

            try {
                val1 = scanner.nextDouble();
                op = scanner.next();
                val2 = scanner.nextDouble();
                cal6.setVal1(val1);
                cal6.setOp(op);
                cal6.setVal2(val2);
                System.out.println(cal6);
            } catch (InputMismatchException e) {
                System.err.println("Ошибка ввода! " + e);
            } catch (ArithmeticException e) {
                System.err.println("Деление на 0! " + e);
            }
        } else if (mode == 6) {
            FileReader fr = new FileReader();
            try {
                System.out.println("Введите путь к файлу (например C://123.txt): ");
                Scanner scanner1 = new Scanner(System.in);
                String path = scanner1.next();
                fr.readFromFile(path);
                Map<String, Integer> map = fr.getStat();
                System.out.println("Содержимое файла в остортированном виде: " + fr.getList());
                System.out.println("Статистика по количеству слов в файле: " + map);
                System.out.println("Наиболее часто повторяющиеся слова: " + fr.maxCount(map));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        scanner.close();
    }
}

