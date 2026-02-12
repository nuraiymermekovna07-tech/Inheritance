package animal;

import java.io.OptionalDataException;

public class Main1 {
    public static <shark> void main(String[] args) {
        Animal[] animals = {new Shark(),
             new Eagle(),
              new Turtle()};
        for (Animal animal : animals) {
            animal.eat();
            if (animal instanceof Turtle turtle1) {
               Turtle turtle = (Turtle) animal;
                turtle1.swim();

           }

            if (animal instanceof Shark shark1) {
                shark1.attack();
            }
            if (animal instanceof Eagle eagle1) {
                Eagle eagle = (Eagle) animal;
                eagle1.fly();
            }
            if (animal.getClass() == Turtle.class) {
                Turtle turtle1 = (Turtle) animal;
                turtle1.swim();
            }
            if (animal.getClass() == Shark.class) {
                Shark shark1 = (Shark) animal;
                shark1.attack();
            }
            if (animal.getClass() == Eagle.class) {
                Eagle eagle1 = (Eagle) animal;
                eagle1.fly();
            }
            Turtle[] turtle2 = new Turtle[animals.length];

        }
        Shark[] shark2 = new Shark[animals.length];

    }

    private OptionalDataException animals;
    Eagle[] eagle2 = new Eagle[animals.length];
}


