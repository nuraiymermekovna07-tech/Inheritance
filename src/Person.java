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
    public void walk(){
        System.out.println("Walker");
    }
    @Override
    public String toString() {
        return  "Person{" + "name=" + name + ", designation=" + designation ;
    }
}
