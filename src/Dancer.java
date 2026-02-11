public class Dancer extends Person{
    private String groupName;
    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = name;
    }
       @Override
        public  void walk(){
            System.out.println("Dancer walking by dancing");
        }
    }

