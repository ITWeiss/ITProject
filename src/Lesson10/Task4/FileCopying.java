package Lesson10.Task4;

import java.io.*;

public class FileCopying {
    public static void main(String[] args) {

        String sourcePath = "source.txt"; // Путь к исходному файлу

        try (FileWriter writer = new FileWriter(sourcePath);
             BufferedReader reader = new BufferedReader(new FileReader(sourcePath))) {
            writer.write("Hello, Java IO! This is the first line.\n");
            writer.write("This is the second line.");
            writer.flush();
        } catch (IOException e) {
            System.out.println("File handling error: " + e.getMessage());
        }

        String targetPath = "target.txt";   // Путь к целевому файлу
        copyFileContent(sourcePath, targetPath);  // Вызов метода копирования

    }

    public static void copyFileContent(String sourcePath, String targetPath) {

        try (FileReader fileReader = new FileReader(sourcePath);
             FileWriter fileWriter = new FileWriter(targetPath)) {
            int data;
            while ((data = fileReader.read()) != -1) {
                fileWriter.write(data);
            }
            System.out.println("Copying completed successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Input/Output Error: " + e.getMessage());
        }
    }
}

