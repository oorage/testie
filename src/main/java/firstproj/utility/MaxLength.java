package firstproj.utility;

import java.util.Scanner;


public class MaxLength {
    public String[] getLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колво слов в строке");
        int length = scanner.nextInt();
        String[] inputLine = new String[length];
        String tmpString;
        for (int i = 0; i < length; i++) {
            System.out.println("Введите слово " + (i + 1));
            tmpString = scanner.next();
            inputLine[i] = tmpString;
        }
        return inputLine;
    }
    public String getMaxElement() {
        String[] input = getLine();
        String result = null;
        int count = 0;
        for (String s : input) {
            if (s.length() > count) {
                count = s.length();
                result = s;
            }
        }
        return result;
    }
}
