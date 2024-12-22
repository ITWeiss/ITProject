package Lesson14.Grouping;

import Lesson14.StreamAPI.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Arthur", 93),
                new Student("Eric", 40),
                new Student("Jane", 64),
                new Student("Robert", 81),
                new Student("Mary", 86)
        );

        // Группировака по оценкам
        Map<String, List<Student>> groupedByGrade = students.stream()
                .collect(Collectors.groupingBy(student -> {
                    if (student.getGrade() >= 90) {
                        return "A";
                    } else if (student.getGrade() >= 80) {
                        return "B";
                    } else if (student.getGrade() >= 70) {
                        return "C";
                    } else if (student.getGrade() >= 60) {
                        return "D";
                    } else {
                        return "F";
                    }
                }));

        groupedByGrade.forEach((grade, name) -> {
            System.out.printf("Grade %s:\n", grade);
            name.forEach(System.out::println);
        });

        // Наивысший балл
        Student maxGrade = students.stream()
                .max(Comparator.comparing(Student::getGrade)).orElse(null);

        System.out.printf("Max grade:\n%s\n", maxGrade);

        // Количество студентов с оценкой ниже 50
        students.stream().filter(student -> student.getGrade() < 50).forEach(System.out::println);
    }
}