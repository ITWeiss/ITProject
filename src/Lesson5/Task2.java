package Lesson5;

public class Task2 {

    public static void main(String[] args) {


        Human[] humans = new Human[3];

        humans[0] = new Human("Aldous", "Huxley" , 38);
        humans[1] = new Human("Kenneth", "Kesey", 27);
        humans[2] = new Human("Harper", "Lee", 34);

        sort(humans);

        for (Human human : humans) {
            System.out.println(human);
        }

    }

    private static void sort(Human[] humans) {
        for (int i = 0; i < humans.length -1; i++) {
            Human temp = humans[i];
            humans[i] = humans[i + 1];
            humans[i + 1] = temp;
        }
    }
}
