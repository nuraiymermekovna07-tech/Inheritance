public class Singer extends Person {
    private String bandName;
    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }
    @Override
    public String toString(){
        return "Singer{" + "bandName=" + bandName + '}';
    }
    public String singing(){
        return "singing";
    }
    public String playgitar(){
        return "playgitar";
    }
}
