package day3Hw2;

public class StudentManager extends UserManager{
    @Override
    public void add() {
        super.add();
        System.out.println("Öğrenci eklendi.");
        System.out.println("----------------");
    }

    @Override
    public void delete() {
        super.delete();
        System.out.println("Öğrenci silindi.");
        System.out.println("----------------");
    }

    @Override
    public void update() {
        super.update();
        System.out.println("Öğrenci güncellendi.");
        System.out.println("----------------");
    }
}
