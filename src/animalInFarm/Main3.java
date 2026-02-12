package animalInFarm;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {


    Farm farm = new Farm("Kulatova 12", "Kutman", new Cow[]{}, new Horse[]{}, new Sheep[]{});
        farm.addAnimal(new

    Cow("Cow1",2,"White",198));
        System.out.println("COWS");
        System.out.println(Arrays.toString(farm.getCows()));
        farm.addAnimal(new

    Sheep("Sheep1",6,"Black",34));
        System.out.println("SHEEP");
        System.out.println(Arrays.toString(farm.getSheep()));
        farm.addAnimal(new
                Horse("Horse1",3,"Black",200));
        System.out.println("HORSE");
        System.out.println(Arrays.toString(farm.getHorses()));
        farm.addAnimal(new
                Cow("Cow2",2,"White",198));
        System.out.println("COW2");
        System.out.println(Arrays.toString(farm.getCows()));
        farm.addAnimal(new
                Sheep("Sheep2",6,"Black",34));
        System.out.println("SHEEP2");
        System.out.println(Arrays.toString(farm.getSheep()));
        farm.addAnimal(new
                Horse("Horse2",3,"Black",200));
        System.out.println("HORSE2");
        System.out.println(Arrays.toString(farm.getHorses()));
        farm.addAnimal(new
                Cow("Cow3",2,"White",198));
        System.out.println("COW3");
        System.out.println(Arrays.toString(farm.getCows()));
        farm.addAnimal(new
                Sheep("Sheep3",6,"Black",34));
        System.out.println("SHEEP3");
        System.out.println(Arrays.toString(farm.getSheep()));
        farm.addAnimal(new
                Cow("Cow4",2,"White",198));
        System.out.println("COW4");
        System.out.println(Arrays.toString(farm.getCows()));
        farm.addAnimal(new
                Cow("Cow5",2,"White",198));
        System.out.println("COW5");
        System.out.println(Arrays.toString(farm.getCows()));


        Farm farm2 = new Farm("Isanova 23","Atai",new Cow[] {},new Horse[]{},new Sheep[]{});
        farm2.addAnimal(new
                Cow("Cow1",2,"White",198));
        System.out.println("Cow of farm2");
        System.out.println(Arrays.toString(farm2.getCows()));
        farm2.addAnimal(new
                Horse("Horse1",2,"Black",198));
        System.out.println("Horse of farm2");
        System.out.println(Arrays.toString(farm2.getHorses()));
        farm2.addAnimal(new
                Sheep("Sheep1",6,"Black",34));
        System.out.println("Sheep of farm2");
        System.out.println(Arrays.toString(farm2.getSheep()));}}
