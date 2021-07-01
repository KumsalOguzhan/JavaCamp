package day3Hw2;

public class Instructor extends User{
    private String[] myCourses;

    public Instructor(int id, String name, String lastName, String email, String birthDate, String[] myCourses) {
        super(id, name, lastName, email, birthDate);
        this.myCourses = myCourses;
    }

    public String[] getMyCourses() {
        return myCourses;
    }

    public void setMyCourses(String[] myCourses) {
        this.myCourses = myCourses;
    }
}
