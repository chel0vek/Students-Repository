import java.util.ArrayList;

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

}
