package javaCollection.home;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.addStudent("Геннадий", 12, 4.5);
        manager.addStudent("Владимир", 14, 3.6);
        manager.addStudent("Борис", 17, 4.6);
        manager.addStudent("Александр", 13, 4.3);
//        manager.CalcMiddleAge();
//        manager.printAllStudents();
//        manager.SortedNameList();
//
//        manager.SortedAgeList();

        manager.findBestStudent();
//        manager.removeStudent("Александр");
//        manager.printAllStudents();

    }
}
