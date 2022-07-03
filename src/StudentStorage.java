import java.util.ArrayList;
import java.util.List;

public class StudentStorage {
    static ArrayList<Student> students = new ArrayList<>();

    public boolean addStudent(Student student) {
        students.add(student);
        return true;
    }

    public boolean removeStudent(int id) {
        students.remove(id);
        return true;
    }

    public void showAllStudents() {
        for (Student list : students) {
            System.out.println(list);
        }
    }

    public ArrayList<Student> searchStudentsByName(String name) {
        ArrayList<Student> foundBooks = new ArrayList<Student>();
        for (int i = 0; i < students.size(); i++) {
            Student current = students.get(i);
            if (current != null && current.getName().equals(name)) {
                foundBooks.add(current);
            }
        }
        return foundBooks;
    }

    public ArrayList<Student> searchStudentsByAge(int age) {
        ArrayList<Student> foundBooks = new ArrayList<Student>();
        for (int i = 0; i < students.size(); i++) {
            Student current = students.get(i);
            if (current != null && current.getAge() == age) {
                foundBooks.add(current);
            }
        }
        return foundBooks;
    }

    public ArrayList<Student> searchStudentsByGroup(int group) {
        ArrayList<Student> foundBooks = new ArrayList<Student>();
        for (int i = 0; i < students.size(); i++) {
            Student current = students.get(i);
            if (current != null && current.getGroup() == group) {
                foundBooks.add(current);
            }
        }
        return foundBooks;
    }

    public ArrayList<Student> searchStudentsByAvg(double avg) {
        ArrayList<Student> foundBooks = new ArrayList<Student>();
        for (int i = 0; i < students.size(); i++) {
            Student current = students.get(i);
            if (current != null && current.getAvgMark() == avg) {
                foundBooks.add(current);
            }
        }
        return foundBooks;
    }
    public List<Student> searchStudentsByAgeBubble(int param) {
        List<Student> studentsCopy = new ArrayList<>(List.copyOf(students));
        if (param == 1) {
            boolean isSorted = false;
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < studentsCopy.size() - 1; i++) {
                    Student current = studentsCopy.get(i);
                    Student next = studentsCopy.get(i + 1);
                    if (current != null && next != null && current.getAge() < next.getAge()) {
                        studentsCopy.set(i, next);
                        studentsCopy.set(i + 1, current);
                        isSorted = false;
                    }
                }
            }
        } else if (param == 2) {
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < studentsCopy.size() - 1; i++) {
                    Student current = studentsCopy.get(i);
                    Student next = studentsCopy.get(i + 1);
                    if (current != null && next != null && current.getAge() > next.getAge()) {
                        studentsCopy.set(i, next);
                        studentsCopy.set(i + 1, current);
                        isSorted = false;
                    }
                }
            }
        }
        return studentsCopy;
    }
}
