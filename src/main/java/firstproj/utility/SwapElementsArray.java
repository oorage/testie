package firstproj.utility;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Arrays;
import java.util.Scanner;

public class SwapElementsArray {

    private int[] array;

    public void setArray() {
        System.out.println("Введите размерность массива");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        this.array = new int[n];
        for (int i = 0; i < n; i++) {
            this.array[i] = (10 - (int) (Math.random() * 20));
        }
        System.out.println("Полученный массив:");
        System.out.println(Arrays.toString(this.array));
    }

    public void swap() {
        setArray();
        int [] tmp = array;
        int val1, index1 = 0;
        int val2, index2 = 0;
        val1 = NumberUtils.max(tmp);
        val2 = NumberUtils.min(tmp);
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] > 0 && tmp[i] < val1) {
                val1 = tmp[i];
                index1 = i;
            } else if (tmp[i] < 0 && tmp[i] > val2) {
                val2 = tmp[i];
                index2 = i;
            }
        }
        this.array[index1] = val2;
        this.array[index2] = val1;
        System.out.println("Массив после перестановки:");
        System.out.println(Arrays.toString(this.array));
    }
}