package day2Hw1;

public class CourseManager {
    public void addCourse(Course course){
        System.out.println(course.getName() + " eklendi.");
    }
    public void deleteCourse(Course course){
        System.out.println(course.getName() + " silindi.");
    }
    public void updateCourse(Course course){
        System.out.println(course.getName() + " güncellendi.");
    }
}
