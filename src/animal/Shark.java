package animal;

public class Shark extends Animal {
    public void attack() {
        System.out.println("Shark attacks");
    }
    @Override
    public void eat() {
        System.out.println("Shark is eating");
    }
}
