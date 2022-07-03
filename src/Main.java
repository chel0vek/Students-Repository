import java.util.Scanner;

public class Main {
    static Student student;
    static StudentStorage studentStorage = new StudentStorage();
    public static void main(String[] args) {
        menu();
    }
    static void menu() {
        try {
            System.out.println("Выберите действие");
            System.out.println("""
                    1. Добавить студента
                    2. Удалить студента
                    3. Показать список всех студентов
                    """);
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            if (choice == 1) {
                addStudentM();
            }
            if (choice == 2) {
                removeStudentM();
            }
            if (choice == 3) {
                showAllStudents();
            }
        }
        catch (Exception e) {
            System.out.println(e + " error");
        }
        finally {
            menu();
        }
    }
    public static void addStudentM() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = input.nextLine();
        System.out.println("Введите возраст");
        int age = input.nextInt();
        System.out.println("Введите группу");
        int group = input.nextInt();
        System.out.println("Введите средний балл");
        double avg = input.nextDouble();
        Student student = new Student(name,age,group,avg);
        var check = studentStorage.addStudent(student);
        if (check) {
            System.out.println("Студент успешно добавлен");
        }
    }
    public static void removeStudentM() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер студента");
        int id = input.nextInt();
        var check = studentStorage.removeStudent(id);
        if (check) {
            System.out.println("Студент успешно удален");
        }
    }
    public static void showAllStudents() {
        System.out.println("Список всех студентов");
        studentStorage.showAllStudents();
    }
}