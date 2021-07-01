package day3Hw2;

public class InstructorManager extends UserManager{
    @Override
    public void add() {
        super.add();
        System.out.println("Eğitmen eklendi.");
        System.out.println("----------------");
    }

    @Override
    public void delete() {
        super.delete();
        System.out.println("Eğitmen silindi.");
        System.out.println("----------------");
    }

    @Override
    public void update() {
        super.update();
        System.out.println("Eğitmen güncellendi.");
        System.out.println("----------------");
    }
}
