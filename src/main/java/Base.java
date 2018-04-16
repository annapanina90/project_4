import java.util.Random;
import java.util.Scanner;

public class Base {
    public static void main (String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 20) - 10);
            System.out.println(array[i]);
        }

        int max = array[0], min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];

            if (array[i] < min)
                min = array[i];
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
    //По очереди будем просматривать все элементы массива
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                //Если находим, запоминаем его индекс
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
        //Если нашелся элемент, меньший, чем на текущей позиции, меняем их местами
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
            //Выведем полученный массив
            System.out.println(array[i]);
        }

    }
    }
