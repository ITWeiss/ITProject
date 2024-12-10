package Lesson10.Task3;

public class UserSearch {
    // Метод для поиска пользователя по идентификатору
    public static void findUserById(int id) throws UserNotFoundException {
        System.out.printf("Search for user ID %d.\n", id);
        if (id < 0) {
            // Если идентификатор меньше 0, выбрасываем исключение
            throw new UserNotFoundException(String.format("User with id = %d not found.\n\n", id));
        }
        // Имитация успешного поиска пользователя
        System.out.println("User found.\n");
    }

    public static void main(String[] args) {

        // Поиск пользователя с неправильным идентификатором
        try {
            findUserById(-6);
        } catch (UserNotFoundException e) {
            System.out.printf("Error: %s", e.getMessage());
        }

        // Поиск пользователя с правильным идентификатором
        try {
            findUserById(4);
        } catch (UserNotFoundException e) {
            System.out.printf("Error: %s", e.getMessage());
        }
    }

}
