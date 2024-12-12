package Lesson12;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionList {
    public static void main(String[] args) {

        ArrayList<String> fruitsList = new ArrayList<>();
        fruitsList.add("Grape");
        fruitsList.add("Grapefruit");
        fruitsList.add("Peach");
        fruitsList.add("Orange");
        fruitsList.add("Apple");

        ArrayList<String> vegetablesList = new ArrayList<>();
        vegetablesList.add("Potato");
        vegetablesList.add("Onion");
        vegetablesList.add("Carrot");
        vegetablesList.add("Tomato");
        vegetablesList.add("Cucumber");

        LinkedList<String> totalList = new LinkedList<>();
        totalList.addAll(fruitsList);
        totalList.addAll(vegetablesList);

        System.out.printf("Total list: %s\n", totalList);
        System.out.println(totalList.containsAll(fruitsList));
        System.out.println(totalList.containsAll(vegetablesList));

        totalList.removeAll(vegetablesList);
        System.out.printf("Total list: %s\n", totalList);
    }
}
