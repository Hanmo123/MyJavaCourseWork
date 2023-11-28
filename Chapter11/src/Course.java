import java.util.ArrayList;

public class Course {
    private String courseName;

    private ArrayList<String> students = new ArrayList<String>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public String[] getStudents() {
        String[] temp = new String[students.size()];
        return students.toArray(temp);
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        students.remove(student);
    }
}