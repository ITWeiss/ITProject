package Lesson11.Swap;

import java.util.ArrayList;
import java.util.List;

public class Swap {
    public static <T> void swap(List<T> list, int index1, int index2) {
        try {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("The list cannot be empty.");
            }
            if (index1 < 0 || index1 >= list.size() ||
                    index2 < 0 || index2 >= list.size()) {
                throw new IndexOutOfBoundsException("Indexes outside the list boundaries.");
            }
            T temp = list.get(index1);
            list.set(index1, list.get(index2));
            list.set(index2, temp);
        } catch (IndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);

        List<String> stringList1 = new ArrayList<>();
        stringList1.add("Apple");
        stringList1.add("Orange");
        stringList1.add("Grape");

        List<String> stringList2 = new ArrayList<>();

        System.out.println(integerList);
        System.out.println(stringList1);

        swap(integerList, 3, 0);
        swap(stringList1, 0, 2);

        System.out.println(integerList);
        System.out.println(stringList1);

        swap(integerList, 0, 5);
        swap(stringList2, 0, 1);
    }
}
