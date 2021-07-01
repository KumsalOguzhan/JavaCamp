package day3Hw2;

public class Student extends User{
    private String[] enrolledCourses;

    public Student(int id, String name, String lastName, String email, String birthDate, String[] enrolledCourses) {
        super(id, name, lastName, email, birthDate);
        this.enrolledCourses = enrolledCourses;
    }

    public String[] getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(String[] enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }
}
