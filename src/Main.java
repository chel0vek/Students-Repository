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
                    1. Добавить ученика
                    """);
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            if (choice == 1) {
                addStudentM();
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
}