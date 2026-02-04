public class Dancer extends Person{
    private String groupName;
    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = name;
    }

    @Override
    public String toString(){
        return "Dancer{" + "groupName=" + groupName + '}' + super.toString();

    }
    public String dancing(){
        return "dancing";
    }
}
