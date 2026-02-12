package animalInFarm;

public class Animal {
    private String name;
    private int age;
    private String color;
    private int weight;
    public Animal(String name, int age, String color, int weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;


    }
    @Override    public String toString() {
        return "Ainimal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + color + '\'' +
                ", weight=" + weight +
                '}';    }}

