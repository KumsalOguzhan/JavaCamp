package day2Hw1;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(1, "emre", "başak", "emrebasak@gmail.com");
        Student student2 = new Student(2, "selin", "ardıç", "selinardıç@gmail.com");

        Instructor instructor = new Instructor(1, "Engin Demiroğ");

        Course course1 = new Course(1, "java", "kurs", 1);
        Course course2 = new Course(2, "C#", "Kurs",1);

        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course1);
        courseManager.deleteCourse(course2);
        courseManager.updateCourse(course1);
    }
}
