import java.util.Scanner;

public class Main {
    static Student student;
    static StudentStorage studentStorage = new StudentStorage();
    static Scanner input = new Scanner(System.in);
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
                    4. Поиск по составляющим
                    5. Сортировка студентов
                    """);
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
            if (choice == 4) {
                findStudentsByConstituents();
            }
            if (choice == 5) {
                sortStudents();
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
        System.out.println("Введите имя");
        String name = input.next();
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
    public static void findStudentsByConstituents() {
            System.out.println("""
                    1. Поиск студента по имени
                    2. Поиск по возрасту
                    3. Поиск по группе
                    4. Поиск по среднему баллу
                    """);
            int choice = input.nextInt();
            if (choice == 1) {
                findStudentByName();
            }
            if(choice == 2) {
                findStudentByAge();
            }
            if (choice == 3) {
                findStudentByGroup();
            }
            if(choice == 4) {
                findStudentByAvg();
            }
    }
    public static void findStudentByName() {
        System.out.println("Введите имя");
        String name = input.nextLine();
        var students = studentStorage.searchStudentsByName(name);
        for (Student list : students) {
            System.out.println(list);
        }
    }
    public static void findStudentByAge() {
        System.out.println("Введите возраст");
        int age = input.nextInt();
        var students = studentStorage.searchStudentsByAge(age);
        for (Student list : students) {
            System.out.println(list);
        }
    }
    public static void findStudentByGroup() {
        System.out.println("Введите группу");
        int group = input.nextInt();
        var students = studentStorage.searchStudentsByGroup(group);
        for (Student list : students) {
            System.out.println(list);
        }
    }
    public static void findStudentByAvg() {
        System.out.println("Введите средний балл");
        double avg = input.nextDouble();
        var students = studentStorage.searchStudentsByAvg(avg);
        for (Student list : students) {
            System.out.println(list);
        }
    }
    public static void sortStudents() {
        try {
            System.out.println("Выберите параметр для сортировки");
            System.out.println("""
                1. Возраст
                2. Средний балл
                3. Группа
                4. Назад
                """);
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.println("""
                    1. По убыванию
                    2. По возрастанию
                    """);
                int param1 = input.nextInt();
                var students = studentStorage.searchStudentsByAgeBubble(param1);
                for (Student list : students) {
                    System.out.println(list);
                }
            } else if (choice == 2) {
                System.out.println("""
                    1. По убыванию
                    2. По возрастанию
                    """);
                int param2 = input.nextInt();
                var students = studentStorage.searchStudentsByAvgBubble(param2);
                for (Student list : students) {
                    System.out.println(list);
                }
            } else if (choice == 3) {
                System.out.println("""
                    1. По убыванию
                    2. По возрастанию
                    """);
                int param3 = input.nextInt();
                var students = studentStorage.searchStudentsByGroupBubble(param3);
                for (Student list : students) {
                    System.out.println(list);
                }
            }
            else {
                menu();
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            sortStudents();
        }
        }

}