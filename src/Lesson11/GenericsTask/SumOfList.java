package Lesson11.GenericsTask;

import java.util.ArrayList;
import java.util.List;

public class SumOfList {

    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.4);
        doubleList.add(1.6);
        doubleList.add(6.9);
        doubleList.add(8.1);

        System.out.printf("Sum of list: %.2f.\n", sumOfList(integerList));
        System.out.printf("Sum of list: %.2f.\n", sumOfList(doubleList));

    }
}
