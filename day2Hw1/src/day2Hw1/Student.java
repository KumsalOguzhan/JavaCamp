package day2Hw1;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Student() {

    }

    public Student(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        System.out.println("Öğrenci oluşturuldu.");
    }
}
