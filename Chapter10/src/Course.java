public class Course {
    private MyString1 courseName;
    private MyString1[] students = new MyString1[100];
    private int numberOfStudents;

    public Course(MyString1 courseName) {
        this.courseName = courseName;
    }

    public void addStudent(MyString1 student) {
        if (numberOfStudents == students.length) {
            MyString1[] newStudents = new MyString1[students.length * 2];
            for (int i = 0; i < students.length; i++) {
                newStudents[i] = students[i];
            }
            students = newStudents;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public MyString1[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public MyString1 getCourseName() {
        return courseName;
    }

    public void dropStudent(MyString1 student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                numberOfStudents--;
                break;
            }
        }
    }

    public void clear() {
        students = new MyString1[100];
        numberOfStudents = 0;
    }
}
