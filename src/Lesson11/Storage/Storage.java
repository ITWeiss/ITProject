package Lesson11.Storage;

import java.util.ArrayList;

public class Storage<T> {

    private ArrayList<T> items;

    public Storage() {
        this.items = new ArrayList<>();
    }

    void add(T item) {
        this.items.add(item);
    }

    public T get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= this.items.size()) {
            throw new IndexOutOfBoundsException(String.format("Error! The item at index: %d is outside the storage.", index));
        }
        return this.items.get(index);
    }

    public int size() {
        return this.items.size();
    }

    public static void main(String[] args) {
        Storage<Integer> intStorage = new Storage<>();
        intStorage.add(7);
        intStorage.add(8);
        intStorage.add(9);

        try {
            System.out.println(intStorage.get(0));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(intStorage.get(3));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("Storage size is %d.", intStorage.size());
    }
}

