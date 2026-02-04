public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String learn(){
        return designation;
    }
    public String walk(){
        return designation;
    }
    public String eat(){
        return designation;
    }
    @Override
    public String toString() {
        return  "Person{" + "name=" + name + ", designation=" + designation + learn() + walk() + eat() + super.toString();
    }
}
