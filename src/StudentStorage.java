import java.util.ArrayList;

public class StudentStorage {
    static ArrayList<Student> students = new ArrayList<>();
    public boolean addStudent(Student student) {
        students.add(student);
        return true;
    }
    public static void removeStudent(int id) {
        students.remove(id);
    }
}
