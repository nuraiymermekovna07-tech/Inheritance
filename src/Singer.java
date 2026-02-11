public class Singer extends Person {
    private String bandName;
    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }
    @Override
    public void walk() {
        System.out.println("Walking by singing");
    }
}
