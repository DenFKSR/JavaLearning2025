package javaCollection.home;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentManager {

//- Добавлять студентов в список
//- Удалять студента по имени
//- Находить студента с самым высоким средним баллом
//- Выводить список студентов, отсортированный по имени
//- Выводить список студентов, отсортированный по возрасту
//- Рассчитывать средний возраст всех студентов


    private List<Student> allStudents = new ArrayList<>();

    public void addStudent(String name, int age, double averageGrade) {
        Student student = new Student(name, age, averageGrade);
        allStudents.add(student);

    }


    public List<Student> printAllStudents() {
        allStudents.stream().forEach(student -> System.out.println(student));
        return allStudents;
    }

    public void removeStudent(String name) {
        System.out.println("");
        System.out.println("Удаление объекта");
        allStudents.removeIf(student -> student.getName().equals(name));
    }

    public void findBestStudent() {
        System.out.println("");
        System.out.println("Поиск лучшего студента");
        Optional<Student> studentOptional = allStudents.stream()
                .max(Comparator.comparingDouble(Student::getAverageGrade));
        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            System.out.println(student);
        } else {
            System.out.println("список пуст");
        }
    }

    //- Выводить список студентов, отсортированный по имени
    public void SortedNameList() {
        System.out.println("");
        System.out.println("сортированный список по имени");
        List<Student> sortedNameList = allStudents.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
        sortedNameList.stream().forEach(student -> System.out.println(student));
    }

    //- Выводить список студентов, отсортированный по возрасту
    public void SortedAgeList() {
        System.out.println("");
        System.out.println("сортированный список по возрасту");
        List<Student> sortedAgeList = allStudents.stream().sorted(Comparator.comparingInt(Student::getAge)).collect(Collectors.toList());
        sortedAgeList.stream().forEach(student -> System.out.println(student));

    }

    //- Рассчитывать средний возраст всех студентов
    public void CalcMiddleAge() {
        int sum = 0;
        int result;
        for (Student s : allStudents) {
            sum = sum + s.getAge();
        }
        result = sum / allStudents.size();
        System.out.println(result);
    }


}
