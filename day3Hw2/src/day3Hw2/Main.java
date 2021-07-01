package day3Hw2;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        ///////////////ADD////////////////
        manager.add(new InstructorManager());
        manager.add(new StudentManager());
        /////////////UPDATE///////////////
        manager.update(new InstructorManager());
        manager.update(new StudentManager());
        /////////////DELETE///////////////
        manager.delete(new InstructorManager());
        manager.delete(new StudentManager());
    }
}
