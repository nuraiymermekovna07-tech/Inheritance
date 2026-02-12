package animalInFarm;

import java.util.Arrays;

public class Farm {
    private String address;
    private String ownerName;
    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheep;

    public Farm(String address, String ownerName, Cow[] cows, Horse[] horses, Sheep[] sheep) {
        this.address = address;
        this.ownerName = ownerName;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
    }
    public void addAnimal(Animal animal){
        if(animal instanceof Cow){
            add(animal, cows, "Cow");
        } else if (animal instanceof Horse) {
            add(animal, horses, "Horse");
        }
        else {
            add(animal, sheep, "Sheep");
        }
    }

    private void add(Animal ainimal, Animal[] ainimals, String type){
        Animal[] ainimals1 = Arrays.copyOf(ainimals, ainimals.length+1);
        ainimals1[ainimals1.length-1] = ainimal;
        if(type.equalsIgnoreCase("Cow")){
            cows = (Cow[]) ainimals1;
        }else if(type.equalsIgnoreCase("Horse")){
            horses = (Horse[]) ainimals1;
        } else {
            sheep = (Sheep[]) ainimals1;
        }
    }
    public void printInfo(Animal[] ainimals) {
        for (Animal a : ainimals) {
            System.out.println(a);
        }

    }
    public String getAddress() {
    return address;
    }public  String getOwnerName() {
    return ownerName;
    }
    public Cow[] getCows() {
        return cows;
    }
    public Horse[] getHorses() {
        return horses;
    }
    public Sheep[] getSheep() {
        return sheep;
    }
    }






