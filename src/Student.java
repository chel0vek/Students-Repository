public class Student {
    public String name;
    public int age;
    public int group;
    public double avgMark;
    public Student(String name, int age, int group, double avgMark) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.avgMark = avgMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "title='" + name + '\'' +
                ", age=" + age +
                ", group=" + group +
                ", avgMark=" + avgMark +
                '}';
    }

    public String getTitle() {
        return name;
    }

    public void setTitle(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(double avgMark) {
        this.avgMark = avgMark;
    }
}
