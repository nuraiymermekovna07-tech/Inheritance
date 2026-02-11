public class Programmer extends Person {
    private String companyName;


    public Programmer (String name, String designation) {
        super(name, designation);
    }
    @Override
    public void walk() {
        System.out.println("Programmer walking");
    }
}

