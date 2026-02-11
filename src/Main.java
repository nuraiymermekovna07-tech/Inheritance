public class Main {
    public static void main(String[] args) {
        System.out.println(" ------ Peson Info ---------");
        Person person = new Person("Nuraiym","Programmer");
        person.walk();
        System.out.println(person);

        System.out.println(" --------- Dancer Info ---------");
        Dancer dancer = new Dancer("Aizat","Dancer","F5");
        dancer.walk();
        System.out.println(dancer);

        System.out.println(" --------- Singer Info ---------");
        Singer singer = new Singer("Aidin","Dancer","Atlant");
        singer.walk();
        System.out.println(singer);
    }
}