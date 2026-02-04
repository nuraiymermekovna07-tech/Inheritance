public class Programmer extends Person {
    private String companyName;


    public Programmer (String name, String designation) {
        super(name, designation);
    }
    @Override
    public String toString() {
        return "Programmer" + "companyName=" + companyName ;
    }
    public String coding(){
        return "coding";
    }
    public String playGitar(){
        return "play gitar";
    }
}

