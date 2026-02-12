package animal;

public class Turtle extends Animal {
    public void swim() {
        System.out.println("Turtle is Swimming");
    }
    @Override
    public void eat() {
        System.out.println("Turtle is eating");
    }
}
