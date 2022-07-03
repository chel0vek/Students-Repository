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
}
